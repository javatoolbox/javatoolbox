package com.github.javatoolbox.result;

public sealed interface Result<V, E> permits Err, Ok {}
