package com.github.javatoolbox.args;

/// A [marker interface](https://en.wikipedia.org/wiki/Marker_interface_pattern) denoting a type that represents a
/// command (as in command-line-interface).
///
/// This interface is not implemented directly by subclasses. It is implemented for subinterfaces at runtime using a
/// [dynamic proxy](https://docs.oracle.com/javase/8/docs/technotes/guides/reflection/proxy.html).
///
/// Implementations of {@link Command} are stateless. That is, the return values of the methods are constant. Repeated
/// invocation always yields the same return value. And, for reference types, the return values are referentially
/// equivalent. That is, `prev == next` is guaranteed to return true.
///
/// # Usage
/// Describe a command by creating an interface which extends {@link Command} with additional methods.
///
/// Each method must be annotated with exactly one of {@link Flag}, {@link Named}, {@link Positional}, or {@link Sub}.
/// There is no limit to the number of methods declared nor the number of times a particular annotation is used.
///
/// ```java
/// public interface DatabaseCommand extends Command {
///     @Flag
///     boolean verbose();
///
///     @Named
///     String username();
///
///     @Named
///     String password();
///
///     @Named
///     Option<String> proxy();
///
///     @Positional
///     String databaseUrl();
///
///     @Sub
///     Option<QueryCommand> query();
///
///     @Sub
///     Option<InsertCommand> insert();
/// }
/// ```
public interface Command {
    @Flag
    boolean help();
}
