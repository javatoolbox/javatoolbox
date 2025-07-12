package com.github.javatoolbox.args.internal.util;

public final class Throwables {
    public static RuntimeException unreachable() { return new IllegalStateException(); }
    public static RuntimeException todo() { return new UnsupportedOperationException("Not yet implemented");  }

    private Throwables() { throw new UnsupportedOperationException(); }
}
