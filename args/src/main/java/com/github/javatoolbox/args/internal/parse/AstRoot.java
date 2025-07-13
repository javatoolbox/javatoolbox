package com.github.javatoolbox.args.internal.parse;

import com.github.javatoolbox.args.internal.span.TokSpan;
import com.github.javatoolbox.args.internal.util.ImmutableArrayList;
import com.github.javatoolbox.option.Option;

public final class AstRoot {
    public final ImmutableArrayList<AstCommand> nodes;
    public final Option<TokSpan> unexpected;

    AstRoot(ImmutableArrayList<AstCommand> nodes, Option<TokSpan> unexpected) {
        if (nodes == null) throw new IllegalArgumentException();
        if (nodes.contains(null)) throw new IllegalArgumentException();
        this.nodes = nodes;

        if (unexpected == null) throw new IllegalArgumentException();
        this.unexpected = unexpected;
    }
}
