package com.github.javatoolbox.args;

public final class ParseValueException extends Exception {
    public ParseValueException(String message) { super(message); }

    public ParseValueException(Throwable cause) { super(cause); }

    public ParseValueException(String message, Throwable cause) { super(message, cause); }

    public ParseValueException() {}
}
