package com.github.javatoolbox.result;

public record Ok<V, E>(V value) implements Result<V, E> {}
