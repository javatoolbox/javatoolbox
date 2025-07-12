package com.github.javatoolbox.args.internal.span;

public final class Tok {
    private final TokSpan ref;
    private final int index;

    Tok(TokSpan ref, int index) {
        if (ref == null) throw new IllegalArgumentException();
        this.ref = ref;

        if (!(0 <= index && index < ref.length())) throw new IllegalArgumentException();
        this.index = index;
    }

    public String asString() {
        return this.ref.ref.raw.asUnmodifiableList().get(this.index);
    }

    public int length() { return this.asString().length(); }

    public CharSpan asCharSpan() { return new CharSpan(this.ref, 0, this.length()); }
}
