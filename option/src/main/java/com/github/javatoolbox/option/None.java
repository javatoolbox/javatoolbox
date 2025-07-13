package com.github.javatoolbox.option;

public record None<T>() implements Option<T> {
    @Override
    public T unwrap() { throw new IllegalStateException(); }
}
