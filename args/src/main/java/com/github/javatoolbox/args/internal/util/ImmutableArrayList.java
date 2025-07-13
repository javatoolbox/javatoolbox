package com.github.javatoolbox.args.internal.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ImmutableArrayList<T> {
    private final ArrayList<T> hidden;

    private ImmutableArrayList(ArrayList<T> hidden) {
        if (hidden == null) throw new IllegalArgumentException();
        this.hidden = hidden;
    }

    public static <T> ImmutableArrayList<T> copyOf(List<T> original) {
        if (original == null) throw new IllegalArgumentException();
        return unsafeWrap(new ArrayList<>(original));
    }

    public static <T> ImmutableArrayList<T> unsafeWrap(ArrayList<T> original) {
        return new ImmutableArrayList<>(original);
    }

    public List<T> asUnmodifiableList() { return Collections.unmodifiableList(this.hidden); }

    // Forward

    public int size() { return this.asUnmodifiableList().size(); }

    public boolean contains(Object o) { return this.asUnmodifiableList().contains(o); }
}
