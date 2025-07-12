package com.github.javatoolbox.args;

import com.github.javatoolbox.option.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

final class ExampleTest {
    @Root(name = "calc")
    interface CalcCommand extends Command {
        @Positional
        int x();

        @Positional
        int y();

        @Flag
        boolean verbose();

        @Sub
        Option<AddCommand> add();

        @Sub
        Option<SubtractCommand> subtract();
    }

    interface AddCommand extends Command {}

    interface SubtractCommand extends Command {}

    @Test
    void main() throws CommandException {
        String[] args = new String[] { "-v", "5", "9", "add" };

        final var command = CommandSupport.parse(CalcCommand.class, args);

        assertTrue(command.verbose());
        assertEquals(5, command.x());
        assertEquals(9, command.y());
        assertInstanceOf(Some.class, command.add());
        assertInstanceOf(None.class, command.subtract());
    }
}
