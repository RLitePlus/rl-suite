package dev.rl.suite.pipeline;

/** A previously validated mutation plan. */
public interface TransformationPlan
{
    String passName();

    void apply(PassContext context);
}
