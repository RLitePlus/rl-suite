package dev.rl.suite;

/** Raised when a guarded transform does not match the expected artifact shape. */
public final class TransformException extends RuntimeException
{
    public TransformException(String message)
    {
        super(message);
    }

    public TransformException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
