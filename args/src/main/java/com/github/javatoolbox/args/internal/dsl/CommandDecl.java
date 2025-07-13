package com.github.javatoolbox.args.internal.dsl;

public sealed interface CommandDecl
permits
        RootCommandDecl,
        SubCommandDecl
{}
