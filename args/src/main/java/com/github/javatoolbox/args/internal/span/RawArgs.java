package com.github.javatoolbox.args.internal.span;

import com.github.javatoolbox.args.internal.util.ImmutableArrayList;

public final class RawArgs {
    final ImmutableArrayList<String> raw;

    public RawArgs(ImmutableArrayList<String> args) {
        if (args == null) throw new IllegalArgumentException();
        if (args.asUnmodifiableList().contains(null)) throw new IllegalArgumentException();
        this.raw = args;
    }

    public TokSpan asTokSpan() { return new TokSpan(this, 0, this.raw.size()); }
}
