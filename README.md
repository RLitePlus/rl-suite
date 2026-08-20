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

- Java 17 or newer. Set `JAVA_HOME` if your default JDK is older.
- The checked-in `./gradlew` wrapper (Gradle 8.12.1).
- The build uses a Java 17 toolchain.

## Deobfuscate a client

**1. Get an official client JAR.** Never a copy from elsewhere.

```shell
curl -O https://repo.runelite.net/net/runelite/injected-client/1.12.34/injected-client-1.12.34.jar
```

**2. Build the tool.**

```shell
./gradlew :transform-jar:shadedJar
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
  --packet-profile osrs-240 \
  --semantic-map semantic.tsv
```

**4. Decompile the output** with the bundled Vineflower 1.11.2 integration:

```shell
java -jar transform-jar/build/libs/rl-suite-1.3.1-all.jar \
  --decompile \
  --input injected-client-1.12.34-deob.jar \
  --source-output injected-client-1.12.34-sources
```

The source directory is replaced only after decompilation succeeds. The verified
deobfuscated JAR is not modified. This repository's current snapshot is under
`semantics/injected-client-1.12.37-sources/`.

Options:

| Option | Purpose |
| --- | --- |
| `--input`, `--output` | Required. The input is never modified. |
| `--report` | Writes an audit JSON with every metric shown above. |
| `--packet-profile` | `osrs-235` through `osrs-240`, `renamed-client-1.12.31.1`, or `none`. Names the packet fields; everything else is unaffected. Auto-selected only for inputs whose checksum is known, so pass it. |
| `--semantic-map` | Optional checksum-bound map of reviewed class, field, and method names. Without it, deterministic generic names are used. |
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
| 240 | 5, except 1.12.37-SNAPSHOT which has 6 | 252 |

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

## Finding the client fields RuneLite does not publish

A launcher built on the injected client has to reach some fields by reflection,
because RuneLite's API does not expose them: the selected scene tile, an actor's
path length, the widget component table, the login statics. Their obfuscated
names change every revision, and one obfuscated name can mean two different
things two revisions apart — at 1.12.33 `dj` is `TileItem`, at 1.12.35 it is
`PacketWriter`. Carrying a name forward is how you point a hook at the wrong
class.

```shell
./gradlew :packet-analysis:shadedJar
java -jar packet-analysis/build/libs/rl-suite-hooks-1.3.1-all.jar --help
```

| Mode | What it does |
| --- | --- |
| `--derive --jar NEW.jar` | Locates each hook in a client JAR. |
| `--verify --jar JAR --mappings M.json` | Checks every class, field and method a mapping file names exists in that JAR with the declared descriptor. Exits 1 if any is missing. |
| `--buffer-infra --jar JAR` | Prints the packet buffer and writer infrastructure: the buffer class and its offset multipliers, `ClientPacket`, `PacketBufferNode`, `PacketWriter` and its ISAAC field. |
| `--extract-semantic-seed --jar MAPPED --raw-jar RAW --tsv OUT` | Transcribes Devious-style mapping annotations and binds them to the exact raw JAR checksum. |
| `--update-semantic --old-jar OLD --new-jar NEW --old-map MAP --tsv OUT` | Carries semantic names to a new revision using reciprocal structural matches. Any unresolved entry prevents output. |
| `--import-version-package --jar JAR --mappings version-package.json --source-commit COMMIT --tsv OUT` | Validates a runtime mapping package against the exact JAR and converts it to native semantic TSV. |
| `--merge-semantic --jar JAR --maps A.tsv,B.tsv --tsv OUT` | Combines checksum-identical semantic maps, rejecting physical or semantic conflicts. |

Every rule is anchored on something the injector cannot rename — an interface a
class declares, or an injected public getter — and reads the answer out of the
bytecode. That makes the rules revision-independent by construction, which is a
claim about them, not a proof. So `--derive` takes a control:

```shell
java -jar packet-analysis/build/libs/rl-suite-hooks-1.3.1-all.jar --derive \
  --control     injected-client-1.12.33.jar \
  --control-hooks hooks-1.12.33.json \
  --jar         injected-client-1.12.35.jar
```

Each rule must first reproduce the known-good answer on the older JAR. If any
disagrees, nothing is printed for the new one:

```
control: 21/21 known hooks reproduced from injected-client-1.12.33.jar

derived from injected-client-1.12.35.jar:
  Actor.pathLength                    dh.bb:I *-1798356091
  Scene.selectedX                     ez.bj:I
  ...
```

The control file is any JSON with `classMappings`, `staticFields` and `garbage`
in the shape the mapping tools already use. A rule that has quietly stopped
matching fails loudly instead of returning a plausible wrong name — which is
what caught a bug in the scene-selection rule while it was being written.

`--derive` finds names, not meanings. That a field is called `pathLength` is
still a claim to check against a running client.

The checksum-bound maps at `data/semantic/1.12.11.tsv` through
`data/semantic/1.12.14.tsv` are reproduced directly from each annotated Devious
client and matching official injected client. `1.12.14.1.tsv` is the exact
structural continuation, and `rev-235.tsv` is the original 1.12.11 seed retained
under its game revision:

```shell
java -jar packet-analysis/build/libs/rl-suite-hooks-1.3.1-all.jar \
  --extract-semantic-seed --jar mapped-235.jar --raw-jar injected-client-1.12.11.jar \
  --tsv semantic-235.tsv --revision 235 --source-commit COMMIT

java -jar packet-analysis/build/libs/rl-suite-hooks-1.3.1-all.jar \
  --update-semantic --old-jar injected-client-1.12.11.jar --new-jar injected-client-next.jar \
  --old-map semantic-235.tsv --tsv semantic-next.tsv --revision NEXT
```

The updater is intentionally fail-closed. A revision that changes or removes a
semantic class still needs an explicit reviewed transition; similarity alone is
not permission to publish a partial map.

The known transitions from 1.12.11 through 1.12.14.1 reproduce all 4,225 or
4,226 identities with zero false or missing rows. The true
1.12.14.1→1.12.15 reobfuscation reset remains intentionally unpublished until
every unresolved identity has reviewed evidence.

`data/semantic/anchors/` contains the smaller checksum-bound set that has passed
that stricter bar: 136 identities at 1.12.15 and 113 identities carried through
the current 1.12.37 snapshot by the structural updater. The current map merges
those with 68 additional non-conflicting identities propagated from an external
runtime mapping package, for 181 total. These are valid semantic maps for analysis, but they are deliberately
not presented as complete replacements for the 4,226-row pre-reset map.
Reviewed exceptional transitions live in `data/semantic/overrides/`.

### Importing runtime mappings

The bridge is data-driven; rl-suite does not copy or run the source mapper.
It validates a generated runtime package against its exact source JAR,
converts it to native TSV, advances it with the existing fail-closed updater,
then merges it with independently reviewed target anchors:

```shell
HOOKS=packet-analysis/build/libs/rl-suite-hooks-1.3.1-all.jar
SOURCE_JAR=/path/to/injected-client-1.12.35.jar
TARGET_JAR=/path/to/injected-client-1.12.37-20260819.170454-4.jar

java -jar "$HOOKS" --import-version-package \
  --jar "$SOURCE_JAR" --mappings version-package.json \
  --source-commit 4cea48fc258486ddb2e3c1291be6a93b7c1052f2 \
  --tsv data/semantic/anchors/1.12.35-version-package.tsv

java -jar "$HOOKS" --update-semantic \
  --old-jar "$SOURCE_JAR" --new-jar "$TARGET_JAR" \
  --old-map data/semantic/anchors/1.12.35-version-package.tsv \
  --anchors data/semantic/anchors/1.12.37-SNAPSHOT-reviewed.tsv \
  --overrides data/semantic/overrides/1.12.35-version-package-to-1.12.36.tsv \
  --tsv data/semantic/anchors/1.12.37-SNAPSHOT-version-package.tsv \
  --revision 1.12.37-20260819.170454-4

java -jar "$HOOKS" --merge-semantic --jar "$TARGET_JAR" \
  --maps data/semantic/anchors/1.12.37-SNAPSHOT-reviewed.tsv,data/semantic/anchors/1.12.37-SNAPSHOT-version-package.tsv \
  --tsv data/semantic/anchors/1.12.37-SNAPSHOT.tsv
```

Four RuneLite-injected fields cross revisions through their stable scalar
`@Named` annotations. The two explicit drops are fields removed in 1.12.36;
all other uncertainty still prevents output. The imported mapping data remains
subject to the BSD 2-Clause terms reproduced below.

`--overrides` accepts eight tab-separated columns with comments beginning `#`:
`kind`, old owner/name/descriptor, `map` or `drop`, and new owner/name/descriptor.
Class identities use `-` for member name and descriptor. A drop uses `-` in all
three target columns. Every override must name an existing old semantic entry;
every mapped target must exist in the new JAR.

`--anchors TARGET.tsv` accepts a partial semantic map for the new JAR. Its
`input.sha256` must match that JAR. Unique semantic identities shared with the
old map become reviewed transitions before structural propagation. Member
identities include the semantic owner class, so common names in unrelated
classes do not collide. Equally ambiguous overload groups remain structural
matches rather than guessed; asymmetric ambiguity and conflicts with
`--overrides` are rejected.

```text
class<TAB>ea<TAB>-<TAB>-<TAB>drop<TAB>-<TAB>-<TAB>-
field<TAB>og<TAB>ar<TAB>Lea;<TAB>map<TAB>NEW_OWNER<TAB>NEW_NAME<TAB>LNEW_TYPE;
```

## What it does not do

- It is not a general OSRS gamepack deobfuscator. It expects RuneLite's already
  injected client.
- Without a reviewed semantic map it does not infer meanings. `field33` is
  stable and traceable, not descriptive.
- It normalizes only arithmetic multipliers proven safe across every access to
  a field. It does not guess through irregular arithmetic, control-flow
  flattening, or string encryption.
- Passing bytecode verification proves the output is structurally valid. It does
  not prove it behaves identically to the input.

## How it works

Six passes, in order. Each finishes its analysis before anything is modified,
and the result is verified twice before it is written.

| Pass | What it does |
| --- | --- |
| `strip-malformed-named` | Removes the invisible array-valued `javax.inject.Named` annotations that break decompilers, keeping the four legitimate ones. |
| `normalize-packet-handlers` | Collapses each packet reader's fragmented try/catch entries down to two and flattens the guarded return gaps. |
| `normalize-condy-concats` | Rewrites three nested constant-dynamic string concatenations as ordinary bytecode. This is why the output is analysis-only. |
| `normalize-proven-decoders` | Removes numeric field multipliers only when every read and write proves the same reversible encoding. |
| `mark-unused-members` | Marks members nothing references with `@ToRemove`. It never deletes anything. |
| `rename-symbols` | Gives every class, field and method a deterministic name, and records the original in a RuneLite mapping annotation. |

Two modules: `transform-jar` holds the pipeline and CLI, `packet-analysis` holds
the packet extraction and cross-revision mapping.

## Third-party mapping attribution

The imported mapping rows under `data/semantic/` are derived from
[Solace](https://github.com/kolief/solace) mapping commit
`4cea48fc258486ddb2e3c1291be6a93b7c1052f2` and retain its BSD 2-Clause terms:

```text
BSD 2-Clause License

Copyright (c) 2026, Solace contributors
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
```
