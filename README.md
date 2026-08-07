# rl-suite

> A special thank you to [blurite/rsprot](https://github.com/blurite/rsprot)
> for the packet mappings.

Turns a RuneLite `injected-client` JAR into a readable copy you can decompile,
and publishes the game's packet tables as plain TSV files.

Two things you can do with it:

- **Deobfuscate a client.** Rename every class, field and method to something
  stable and readable, strip the annotations that break decompilers, and record
  each original name so you can map back.
- **Read the packet tables.** For revisions 235 to 240 the packet ids, names,
  lengths and field layouts are already extracted into `data/`, for both
  directions. You do not have to run anything to use those.

> **The output is for reading, not for playing.** One pass rewrites three lazy
> string-concatenation sites into ordinary bytecode so decompilers can handle
> them, which changes when those constants are computed. Keep your original JAR
> and do not log in with the output.

## Before and after

### Finding the menu action handler

RuneLite injects a named `menuAction` into `client`, but it is a thin wrapper.
The real work happens in a gamepack method whose name carries no information.
In RuneLite 1.12.34 that method is `ef` on class `qp`:

```java
// before — javap of client, inside menuAction
public void menuAction(int, int, net.runelite.api.MenuAction, int, int, String, String);
    ...
    60: bipush        -44
    62: invokestatic  qp.ef:(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V
```

Nothing about `qp.ef` tells you it is the menu action handler, and both names
change with every build. After a run:

```java
// after — javap of client, same method
public void menuAction(int, int, net.runelite.api.MenuAction, int, int, String, String);
    ...
    60: bipush        -44
    62: invokestatic  classQP.method9682:(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V
```

| Before | After | What it is |
| --- | --- | --- |
| `qp` | `classQP` | the class holding the handler |
| `ef` | `method9682` | the handler itself |

Every original is recorded in an annotation, so nothing is lost and you can map
back to the build you started from:

```java
@ObfuscatedName("qp")
public class classQP {
  @ObfuscatedName("ef")
  @ObfuscatedSignature(descriptor = "(IIIIIILjava/lang/String;Ljava/lang/String;IIB)V")
  public static final void method9682(
      int, int, int, int, int, int, String, String, int, int, byte);
}
```

The names are stable rather than descriptive — `method9682` is a number, not a
word. What it buys you is a name that holds still while you work, and a way back
to `ef` when you need it. That trailing `byte` parameter is a garbage argument
the client passes and ignores; you can see it pushed as `-44` at the call site.

### What one run cleans up

Measured on RuneLite 1.12.34, from its audit report:

| | Before | After |
| --- | ---: | ---: |
| Poison `@Named` annotations | 26,217 | 0 |
| Exception-table entries in packet handlers | 1,640 | 10 |
| Nested constant-dynamic concat sites | 3 | 0 |
| Classes in the archive | 735 | 735 |
| Classes renamed | — | 696 |
| Packet names applied | — | 252 |

The same input always produces a byte-identical output, so you can check a
result against someone else's by hash.

### Packet tables

The client stores packets as numbered fields with no names. The tool reads the
table out of the bytecode, applies the published names, and writes the field
layout it found:

```
before   an obfuscated static field holding a packet with id 0 and length 6,
         and a buffer method per field with a one- or two-letter name
after    0   EVENT_MOUSE_CLICK_V1   6   ...
```

`data/rev-240/mappings/client-packets.tsv` — packets the client sends:

```
id  name                length  write_count  fields
1   IF_BUTTONX          9       4            W4[r 24,v,r 8,r 16](bz),W2[r 8,v](bv),W2[r 8,v](bv),W1[v](uq)
2   OPWORLDENTITY4      3       2            W2[r 8,v](bv),W1[s 0](dj)
3   RESUME_P_OBJDIALOG  2       1            W2[r 8,v](bv)
```

`data/rev-240/mappings/server-packets.tsv` — packets the server sends:

```
id  name                   length  read_count  fields
0   CAM_TARGET_V4          5       2           I1(lt),I4(eb)
1   IF_SETOBJECT           10      3           I2(hn),I4(eb),I4(eb)
2   MESSAGE_FRIENDCHANNEL  -1      5           X1(dc),J0(ci),I2(sr),I3(yz),I1(cf)
```

`data/rev-239/mappings/client-mapping-to-240.tsv` — the same packet across two
revisions, which is how you carry work forward when ids change:

```
source_id  target_id  source_name                target_name                fields
0          101        OPNPC6                     OPNPC6                     W2[r 8,v](bd)
1          32         SEND_PING_REPLY            SEND_PING_REPLY            W4[r 16,r 24,v,r 8](et),...
2          100        CLANSETTINGS_FULL_REQUEST  CLANSETTINGS_FULL_REQUEST  W1[v](bw)
```

## Reading the packet files

| Column | Meaning |
| --- | --- |
| `id` | The number on the wire. |
| `name` | The published name, or `-` where none exists. |
| `length` | Bytes of payload. `-1` means a one-byte length prefix, `-2` a two-byte one. |
| `write_count` / `read_count` | How many buffer operations make up the payload. |
| `fields` | The payload, in order. |

A field looks like `W2[r 8,v](bv)` when the client writes it, or `I4(eb)` when
it reads one:

- `W2` — a write of 2 bytes. The number is how many bytes the buffer method
  stores.
- `I4` — a read of 4 bytes returning an `int`. The letter is the buffer method's
  Java return type: `I` int, `J` long, `Z` boolean, `B` byte, `V` void, and `X`
  for anything else, mostly strings and arrays. The number is how many bytes it
  takes off the buffer, so `J0` and `V0` read none directly and do their work
  through a helper.
- `[r 8,v]` — how each byte is derived from the value, one entry per byte
  written. `v` is the value as-is, `r 8` is the value shifted right 8 bits (so
  the second byte of a larger number), `a 128` is the value plus 128, `s 0` is
  0 minus the value, and `strn` is a string. These encodings change between
  revisions, which is part of why a payload from one revision does not match
  the next.
- `(bv)` — the obfuscated name of the buffer method, so you can find it in the
  jar.

## Revisions already extracted

Nothing to run — these are in `data/`. Every name is checked against the
published protocol tables, and all of them match.

| Revision | RuneLite builds | Client packets | Server packets |
| ---: | --- | ---: | ---: |
| 235 | 1.11.16 – 1.11.19 | 101 | 141 |
| 236 | 1.11.20 – 1.11.23 | 101 | 135 |
| 237 | 1.12.15 – 1.12.20 | 101 | 143 |
| 238 | 1.12.21 – 1.12.24 | 117 | 139 |
| 239 | 1.12.30 – 1.12.33 | 117 | 149 |
| 240 | 1.12.34 – 1.12.36-SNAPSHOT | 117 | 152 |

Revisions 239 and 240 leave 16 client entries unnamed. Those are table slots for
packets that were removed: the published protocol does not name them and no code
in the client sends them.

**A new RuneLite version does not mean a new protocol.** Several builds share a
revision. Builds are also not interchangeable within a revision-sized group —
1.11.24 through 1.12.14 have the same number of client packets as revision 236
but assign different ids, and are a different protocol.

## Requirements

- A JDK that Gradle 9 supports, so Java 17 through 24. Set `JAVA_HOME` to one of
  those if your default is newer.
- Gradle 9.
- The code itself compiles and runs on Java 11 through a Gradle toolchain, which
  is downloaded for you.

## Deobfuscate a client

**1. Get an official client JAR.** Never a copy from elsewhere.

```shell
curl -O https://repo.runelite.net/net/runelite/injected-client/1.12.34/injected-client-1.12.34.jar
```

**2. Build the tool.**

```shell
gradle :transform-jar:shadedJar
```

**3. Run it.** `--packet-profile` is optional. Without it you still get a full
deobfuscation; you just get generic `fieldN` names on the packet fields instead
of real ones. There is a profile for every revision in the table above — pick the
one matching the revision your build belongs to.

```shell
java -jar transform-jar/build/libs/rl-suite-1.3.1-all.jar \
  --input  injected-client-1.12.34.jar \
  --output injected-client-1.12.34-deob.jar \
  --report audit.json \
  --packet-profile osrs-240
```

**4. Decompile the output** with Vineflower, or open it in a decompiler of your
choice.

Options:

| Option | Purpose |
| --- | --- |
| `--input`, `--output` | Required. The input is never modified. |
| `--report` | Writes an audit JSON with every metric shown above. |
| `--packet-profile` | `osrs-235` through `osrs-240`, `renamed-client-1.12.31.1`, or `none`. Names the packet fields; everything else is unaffected. Auto-selected only for inputs whose checksum is known, so pass it. |
| `--expected-malformed-named`<br>`--expected-packet-handlers`<br>`--expected-packet-ranges`<br>`--expected-condy-sites` | Pin a count. The run fails if the input does not match, instead of guessing. |

**Revisions 235 to 238 need `--expected-packet-handlers`.** The tool looks for
five packet readers by default, which is what 239 and 240 have. Older clients
have fewer, and the run stops rather than guessing. The failure tells you the
number it found:

```
Expected 5 packet-handler shapes, found 4
```

Pass that number back as `--expected-packet-handlers 4` and the run proceeds.

The count is a property of the build, not of the revision — two builds inside
one revision can differ. Every build tested so far:

| Revision | Packet readers | Names applied |
| ---: | --- | ---: |
| 235 | 4 | 242 |
| 236 | 3 | 236 |
| 237 | 4, except 1.12.20 which has 5 | 243 |
| 238 | 4, except 1.12.22.1 which has 5 | 256 |
| 239 | 5 (the default, nothing to pass) | 250 |
| 240 | 5 (the default, nothing to pass) | 252 |

Each build's own count is recorded as `packet.handlers.matched` in its audit
report under `data/rev-<n>/audit/`.

A packet profile is a name list, nothing more. The packet table itself — every
id and length — is read straight out of the bytecode, so the tool finds packets
in a revision it has never seen. The profiles are ordinary TSV files checked in
under `transform-jar/src/main/resources`, one per revision, named
`osrs-<revision>.tsv`. Nothing is downloaded and there is no runtime dependency
on anything outside this repository. Each file records in its own header where
its names were obtained, so a name can be traced back and rechecked.

The tool stops rather than guessing. A changed annotation shape, packet handler
geometry, packet table, or unknown attribute ends the run before anything is
written. A JAR from a revision it has not seen is refused at one of three points,
in this order:

| Refusal | What it means | What to do |
| --- | --- | --- |
| Unrecognised input checksum | The build is not one whose checksum is known, so no profile is picked for you. Raised before the JAR is parsed. | Pass `--packet-profile` explicitly. |
| Packet fingerprint matches nothing | The wire protocol revision changed. Every bundled profile fails identically, so this is a different protocol, not a tolerance problem. | Compare the id and length table in the JAR against the profile TSVs to see which revision it really is. |
| No packet handlers found | The five packet readers are located by an exact exception-table size, and that size changed. | Take a histogram of try/catch-block counts over every method whose descriptor ends in `)Z`. The five handlers stand far apart from everything else, so if exactly five methods share one large even count, the geometry is intact and only the number changed. |

Matching a fingerprint proves structure, not meaning. It cannot detect a revision
that keeps every id's length but reassigns what those ids mean, so choosing a
profile is an acknowledgement rather than a proof.

## Extracting packets yourself

The files under `data/` were produced by the `packet-analysis` module and are
checked in, so normal use needs nothing further. The extraction code is the
library in `packet-analysis/src/main`: it reads the packet table out of the
bytecode, recovers each payload's field layout, and maps packets from one
revision onto the next. There is no command that regenerates `data/` — the
generators that drove the library are not part of the repository — so adding a
revision means calling that library yourself.

One step is easy to get wrong: deciding which RuneLite builds actually carry a
given revision's packet table. **Do not group builds by how many entries their
packet table has.** Several builds carry a 101-entry or 117-entry client table
while assigning entirely different ids. Builds 1.11.24 through 1.12.14 have
revision 236's table size, and 1.12.25 through 1.12.29 have revision 238's, and
neither is that revision. Of 103 published builds, only 30 match one of the six
tables here. Compare every id-to-length pair instead, and use only builds that
match exactly.

This is not a small effect. Standing in size-matched but id-mismatched builds for
revisions 236 and 238 measured cross-revision accuracy at 7.7%; using the aligned
builds and changing nothing else took the same measurement to 40.3%.

## What it does not do

- It is not a general OSRS gamepack deobfuscator. It expects RuneLite's already
  injected client.
- It does not recover meaningful names beyond the packet profiles. `field33` is
  stable and traceable, not descriptive.
- It does not undo control-flow flattening, arithmetic multipliers, or string
  encryption.
- Passing bytecode verification proves the output is structurally valid. It does
  not prove it behaves identically to the input.

## How it works

Five passes, in order. Each finishes its analysis before anything is modified,
and the result is verified twice before it is written.

| Pass | What it does |
| --- | --- |
| `strip-malformed-named` | Removes the invisible array-valued `javax.inject.Named` annotations that break decompilers, keeping the four legitimate ones. |
| `normalize-packet-handlers` | Collapses each packet reader's fragmented try/catch entries down to two and flattens the guarded return gaps. |
| `normalize-condy-concats` | Rewrites three nested constant-dynamic string concatenations as ordinary bytecode. This is why the output is analysis-only. |
| `mark-unused-members` | Marks members nothing references with `@ToRemove`. It never deletes anything. |
| `rename-symbols` | Gives every class, field and method a deterministic name, and records the original in a RuneLite mapping annotation. |

Two modules: `transform-jar` holds the pipeline and CLI, `packet-analysis` holds
the packet extraction and cross-revision mapping.
