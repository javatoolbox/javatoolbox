package com.github.javatoolbox.args.internal.dsl;

public sealed interface ChildDecl
permits
        FlagDecl,
        NamedValueDecl,
        PositionalDecl,
        SubCommandDecl
{}