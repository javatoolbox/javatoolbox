package com.github.javatoolbox.args;

public final class CommandSupport {
    public static <T extends Command> T parse(Class<T> def, String[] args) throws CommandException {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private CommandSupport() { throw new UnsupportedOperationException(); }
}
