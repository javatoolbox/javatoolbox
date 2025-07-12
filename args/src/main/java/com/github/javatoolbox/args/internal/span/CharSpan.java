package com.github.javatoolbox.args.internal.span;

public final class CharSpan {
    private final TokSpan ref;
    private final int begin;
    private final int end;

    CharSpan(TokSpan ref, int begin, int end) {
        if (ref == null) throw new IllegalArgumentException();
        this.ref = ref;

        if (!(0 <= begin && begin <= end)) throw new IllegalArgumentException();
        this.begin = begin;
        this.end = end;
    }
}
