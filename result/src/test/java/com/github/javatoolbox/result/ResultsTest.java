package com.github.javatoolbox.result;

import org.junit.jupiter.api.Test;

import static com.github.javatoolbox.result.Results.err;
import static com.github.javatoolbox.result.Results.ok;
import static org.junit.jupiter.api.Assertions.assertEquals;

final class ResultsTest {
    @Test
    void ok_returns_Ok() {
        final Result<Integer, Never> expected = new Ok<>(1);
        final Result<Integer, Never> actual = ok(1);
        assertEquals(expected, actual);
    }

    @Test
    void err_returns_Err() {
        final Result<Never, Integer> expected = new Err<>(1);
        final Result<Never, Integer> actual = err(1);
        assertEquals(expected, actual);
    }
}
