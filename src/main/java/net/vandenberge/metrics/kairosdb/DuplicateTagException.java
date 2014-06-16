package net.vandenberge.metrics.kairosdb;

/**
 *
 */
public class DuplicateTagException extends RuntimeException {

    public DuplicateTagException(String message) {
        super( message );
    }

    public DuplicateTagException(String message, Throwable cause) {
        super( message, cause );
    }

}
