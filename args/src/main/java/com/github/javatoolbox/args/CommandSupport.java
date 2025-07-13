package com.github.javatoolbox.args;

import java.util.Collections;

public final class CommandSupport {
    public static <T extends Command> T parse(Class<T> def, String[] args) throws CommandException {
        return parse(def, args, Config.of(
                /* morevalueparsers = */ Collections.emptyList()
        ));
    }

    public static <T extends Command> T parse(Class<T> def, String[] args, Config config)
    throws CommandException
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private CommandSupport() { throw new UnsupportedOperationException(); }
}
