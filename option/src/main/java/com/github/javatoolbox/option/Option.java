package com.github.javatoolbox.option;

public sealed interface Option<T> permits Some, None {
    T unwrap();
}
