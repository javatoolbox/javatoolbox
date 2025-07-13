package com.github.javatoolbox.args;

import com.github.javatoolbox.option.Option;
import com.github.javatoolbox.result.Result;

import java.lang.reflect.Type;

@FunctionalInterface
public interface ValueParser {
    Option<Result<Object, ParseValueException>> parse(Type type, String text);
}
