package dev.rl.suite;

import dev.rl.suite.packet.PacketProfileMode;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;

public final class TransformConfig
{
    private final Path input;
    private final Path output;
    private final Path report;
    private final OptionalLong expectedMalformedNamed;
    private final long expectedPacketHandlers;
    private final long expectedPacketRanges;
    private final long expectedCondySites;
    private final PacketProfileMode packetProfileMode;
    private final boolean packetProfileExplicit;
    private final Path semanticMap;

    private TransformConfig(Builder builder)
    {
        this.input = Objects.requireNonNull(builder.input, "input");
        this.output = Objects.requireNonNull(builder.output, "output");
        this.report = Objects.requireNonNull(builder.report, "report");
        this.expectedMalformedNamed = builder.expectedMalformedNamed;
        this.expectedPacketHandlers = builder.expectedPacketHandlers;
        this.expectedPacketRanges = builder.expectedPacketRanges;
        this.expectedCondySites = builder.expectedCondySites;
        this.packetProfileMode = Objects.requireNonNull(builder.packetProfileMode,
            "packetProfileMode");
        this.packetProfileExplicit = builder.packetProfileExplicit;
        this.semanticMap = builder.semanticMap;
    }

    public Path getInput()
    {
        return input;
    }

    public Path getOutput()
    {
        return output;
    }

    public Path getReport()
    {
        return report;
    }

    public OptionalLong getExpectedMalformedNamed()
    {
        return expectedMalformedNamed;
    }

    public long getExpectedPacketHandlers()
    {
        return expectedPacketHandlers;
    }

    /**
     * Pinned number of try/catch ranges per packet handler, or -1 to accept
     * whatever the five matched handlers agree on. The count is 162 for
     * 1.12.31 through 1.12.33 and 164 for 1.12.34; it tracks the gamepack, not
     * the packet table, so it cannot be derived from a packet profile.
     */
    public long getExpectedPacketRanges()
    {
        return expectedPacketRanges;
    }

    public long getExpectedCondySites()
    {
        return expectedCondySites;
    }

    public PacketProfileMode getPacketProfileMode()
    {
        return packetProfileMode;
    }

    public boolean isPacketProfileExplicit()
    {
        return packetProfileExplicit;
    }

    public Optional<Path> getSemanticMap()
    {
        return Optional.ofNullable(semanticMap);
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static final class Builder
    {
        private Path input;
        private Path output;
        private Path report;
        private OptionalLong expectedMalformedNamed = OptionalLong.empty();
        private long expectedPacketHandlers = 5L;
        private long expectedPacketRanges = -1L;
        private long expectedCondySites = 3L;
        private PacketProfileMode packetProfileMode = PacketProfileMode.OSRS_239;
        private boolean packetProfileExplicit;
        private Path semanticMap;

        public Builder input(Path input)
        {
            this.input = input;
            return this;
        }

        public Builder output(Path output)
        {
            this.output = output;
            return this;
        }

        public Builder report(Path report)
        {
            this.report = report;
            return this;
        }

        public Builder expectedMalformedNamed(long expectedMalformedNamed)
        {
            if (expectedMalformedNamed < 0)
            {
                throw new IllegalArgumentException("expectedMalformedNamed must be non-negative");
            }
            this.expectedMalformedNamed = OptionalLong.of(expectedMalformedNamed);
            return this;
        }

        public Builder expectedPacketHandlers(long expectedPacketHandlers)
        {
            if (expectedPacketHandlers < 0)
            {
                throw new IllegalArgumentException("expectedPacketHandlers must be non-negative");
            }
            this.expectedPacketHandlers = expectedPacketHandlers;
            return this;
        }

        public Builder expectedPacketRanges(long expectedPacketRanges)
        {
            if (expectedPacketRanges < 0)
            {
                throw new IllegalArgumentException("expectedPacketRanges must be non-negative");
            }
            this.expectedPacketRanges = expectedPacketRanges;
            return this;
        }

        public Builder expectedCondySites(long expectedCondySites)
        {
            if (expectedCondySites < 0)
            {
                throw new IllegalArgumentException("expectedCondySites must be non-negative");
            }
            this.expectedCondySites = expectedCondySites;
            return this;
        }

        public Builder packetProfileMode(PacketProfileMode packetProfileMode)
        {
            this.packetProfileMode = Objects.requireNonNull(packetProfileMode,
                "packetProfileMode");
            this.packetProfileExplicit = true;
            return this;
        }

        public Builder semanticMap(Path semanticMap)
        {
            this.semanticMap = Objects.requireNonNull(semanticMap, "semanticMap");
            return this;
        }

        public TransformConfig build()
        {
            return new TransformConfig(this);
        }
    }
}
