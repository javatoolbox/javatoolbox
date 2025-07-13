package com.github.javatoolbox.args.internal.parse;

import com.github.javatoolbox.args.internal.dsl.CommandDecl;

public final class AstCommand {
    private final CommandDecl decl;

    AstCommand(CommandDecl decl) {
        if (decl == null) throw new IllegalArgumentException();
        this.decl = decl;
    }
}
