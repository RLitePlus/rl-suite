package dev.rl.suite.pipeline;

/** A previously validated mutation plan. */
public interface TransformationPlan
{
    void apply(PassContext context);
}
