package com.github.javatoolbox.option;

import org.junit.jupiter.api.Test;

import static com.github.javatoolbox.option.Options.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

final class OptionsTest {
    @Test
    void some_returns_Some() {
        final Option<Integer> expected = new Some<>(1);
        final Option<Integer> actual = some(1);
        assertEquals(expected, actual);
    }

    @Test
    void none_returns_None() {
        final Option<Integer> expected = new None<>();
        final Option<Integer> actual = none();
        assertEquals(expected, actual);
    }

    @Test
    void maybe_null_returns_None() {
        final Option<Integer> expected = new None<>();
        final Option<Integer> actual = maybe(null);
        assertEquals(expected, actual);
    }

    @Test
    void maybe_non_null_returns_Some() {
        final Option<Integer> expected = new Some<>(1);
        final Option<Integer> actual = maybe(1);
        assertEquals(expected, actual);
    }
}
