package net.vandenberge.metrics.kairosdb;

/**
 *
 */
public class InvalidTagException extends RuntimeException {

    public InvalidTagException(String message) {
        super( message );
    }

    public InvalidTagException(String message, Throwable cause) {
        super( message, cause );
    }

}
