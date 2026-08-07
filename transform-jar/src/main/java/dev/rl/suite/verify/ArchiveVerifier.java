package dev.rl.suite.verify;

import dev.rl.suite.TransformException;
import dev.rl.suite.model.ClassUnit;
import dev.rl.suite.model.JarArchive;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.AnalyzerException;
import org.objectweb.asm.tree.analysis.BasicInterpreter;
import org.objectweb.asm.tree.analysis.BasicValue;

/** Performs classpath-independent stack/data-flow verification on every method. */
public final class ArchiveVerifier
{
    public Result verify(JarArchive archive)
    {
        long verifiedMethods = 0;
        List<String> errors = new ArrayList<>();

        for (ClassUnit unit : archive.getClasses())
        {
            for (MethodNode method : unit.getNode().methods)
            {
                if (method.instructions == null || method.instructions.size() == 0)
                {
                    continue;
                }
                try
                {
                    Analyzer<BasicValue> analyzer = new Analyzer<>(new BasicInterpreter());
                    analyzer.analyze(unit.getNode().name, method);
                    verifiedMethods++;
                }
                catch (AnalyzerException | RuntimeException ex)
                {
                    errors.add(unit.getNode().name + "." + method.name + method.desc + ": " + ex.getMessage());
                }
            }
        }
        return new Result(verifiedMethods, errors);
    }

    public Result verifyOrThrow(JarArchive archive)
    {
        Result result = verify(archive);
        if (!result.errors.isEmpty())
        {
            StringBuilder message = new StringBuilder("Bytecode verification failed with ")
                .append(result.errors.size()).append(" error(s)");
            for (int index = 0; index < Math.min(result.errors.size(), 10); index++)
            {
                message.append("\n - ").append(result.errors.get(index));
            }
            throw new TransformException(message.toString());
        }
        return result;
    }

    public static final class Result
    {
        private final long verifiedMethods;
        private final List<String> errors;

        Result(long verifiedMethods, List<String> errors)
        {
            this.verifiedMethods = verifiedMethods;
            this.errors = Collections.unmodifiableList(new ArrayList<>(errors));
        }

        public long getVerifiedMethods()
        {
            return verifiedMethods;
        }

        public List<String> getErrors()
        {
            return errors;
        }
    }
}
