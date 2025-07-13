package com.github.javatoolbox.args.internal.parse;

import com.github.javatoolbox.args.ParseValueException;
import com.github.javatoolbox.args.internal.span.CharSpan;
import com.github.javatoolbox.option.Option;
import com.github.javatoolbox.result.Result;

public class AstValue {
    private final CharSpan span;
    private final Option<Result<Object, ParseValueException>> value;

    public AstValue(CharSpan span, Option<Result<Object, ParseValueException>> value) {
        if (span == null) throw new IllegalArgumentException();
        this.span = span;

        if (value == null) throw new IllegalArgumentException();
        this.value = value;
    }

}
