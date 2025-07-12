package com.github.javatoolbox.args;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/// Indicates that a method in a {@link Command} represents a *subcommand*.
///
/// There is no limit to the number of *subcommands* which can be declared in a particular
/// {@link Command}.
///
/// The return type of any method annotated with {@link Sub} must be a subinterface of {@link Command}.
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Sub {
    String description() default "";
}
