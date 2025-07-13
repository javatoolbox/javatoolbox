package com.github.javatoolbox.args;

import com.github.javatoolbox.args.internal.util.ImmutableArrayList;

import java.util.ArrayList;
import java.util.Collection;

public final class Config {
    private final ImmutableArrayList<ValueParser> valueparsers;

    private Config(ImmutableArrayList<ValueParser> valueparsers) {
        if (valueparsers == null) throw new IllegalArgumentException();
        if (valueparsers.contains(null)) throw new IllegalArgumentException();
        this.valueparsers = valueparsers;
    }

    public static Config of(Collection<ValueParser> morevalueparsers) {
        if (morevalueparsers == null) throw new IllegalArgumentException();
        final var valueparsers = new ArrayList<ValueParser>();
        valueparsers.addAll(morevalueparsers);
        valueparsers.add(new StringValueParser());
        return new Config(ImmutableArrayList.unsafeWrap(valueparsers));
    }
}
