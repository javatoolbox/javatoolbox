package com.github.javatoolbox.result;

public record Err<V, E>(E err) implements Result<V, E> {}
