package com.github.javatoolbox.args;

public sealed abstract class CommandException extends Exception permits HelpCommandException, ParseCommandException {}
