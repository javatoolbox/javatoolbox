package com.github.javatoolbox.option;

public final class Options {

    public static <T> Option<T> some(T value) { return new Some<>(value); }

    public static <T> Option<T> none() { return new None<>(); }

    public static <T> Option<T> maybe(T value) {
        if (value == null)
            return none();
        else
            return some(value);
    }

    private Options() { throw new UnsupportedOperationException(); }
}
