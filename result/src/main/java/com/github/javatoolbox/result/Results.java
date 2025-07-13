package com.github.javatoolbox.result;

public final class Results {
    public static <T, E> Result<T, E> ok(T value) { return new Ok<>(value); }

    public static <T, E> Result<T, E> err(E err) { return new Err<>(err); }

    private Results() { throw new UnsupportedOperationException(); }
}
