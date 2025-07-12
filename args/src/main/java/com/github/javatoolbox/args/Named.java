package com.github.javatoolbox.args;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Optional;

/// Indicates that a method in a {@link Command} represents a *named value*.
///
/// There is no limit to the number of *named values* which can be declared in a particular
/// {@link Command}.
///
/// *Named values* are required unless their type is wrapped in an {@link Optional}.
///
/// ```java
/// interface MyCommand extends Command {
///     @Named
///     Optional<StringArg> password();
/// }
/// ```
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Named {
    String description() default "";
}
