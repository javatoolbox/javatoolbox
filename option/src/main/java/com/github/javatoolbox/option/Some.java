package com.github.javatoolbox.option;

public record Some<T>(T value) implements Option<T> {
    public Some {
        if (value == null) throw new IllegalArgumentException();
    }
}
