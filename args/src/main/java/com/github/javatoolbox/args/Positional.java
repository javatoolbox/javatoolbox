package com.github.javatoolbox.args;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Optional;

/// Indicates that a method in a {@link Command} represents a *positionals argument*.
///
/// There is no limit to the number of *positionals arguments* which can be declared in a particular
/// {@link Command}.
///
/// *Positional arguments* are ordered lexicographically by method name.
///
/// *Positional arguments* are never optional. A method annotated with {@link Positional} must not return {@link Optional}.
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Positional {
    String description() default "";
}