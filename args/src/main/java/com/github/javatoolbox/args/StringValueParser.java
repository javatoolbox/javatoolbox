package com.github.javatoolbox.args;

import com.github.javatoolbox.option.Option;
import com.github.javatoolbox.result.Result;

import java.lang.reflect.Type;
import java.util.Objects;

import static com.github.javatoolbox.option.Options.none;
import static com.github.javatoolbox.option.Options.some;
import static com.github.javatoolbox.result.Results.ok;

public final class StringValueParser implements ValueParser {
    @Override
    public Option<Result<Object, ParseValueException>> parse(Type type, String text) {
        if (Objects.equals(type, String.class))
            return some(ok(type));
        else
            return none();
    }
}
