package com.github.javatoolbox.args;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/// Indicates that a method in a {@link Command} represents a *flag*. That is, an option that is
/// either on or off.
///
/// There is no limit to the number of *flags* which can be declared in a particular
/// {@link Command}.
///
/// The return type of any method annotated with {@link Flag} must be boolean.
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Flag {
    String description() default "";
}
