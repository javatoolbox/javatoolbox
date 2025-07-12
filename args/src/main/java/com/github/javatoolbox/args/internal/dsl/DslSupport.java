package com.github.javatoolbox.args.internal.dsl;

import com.github.javatoolbox.args.Command;

public final class DslSupport {
    public static RootCommandDecl dsl(Class<? extends Command> root) {
        if (root == null) throw new IllegalArgumentException();
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private DslSupport() { throw new UnsupportedOperationException(); }
}
