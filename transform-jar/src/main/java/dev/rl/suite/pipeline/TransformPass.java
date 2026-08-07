package dev.rl.suite.pipeline;

public interface TransformPass
{
    String name();

    /** Analyze and validate the untouched input. This method must not mutate it. */
    TransformationPlan analyze(PassContext context);
}
