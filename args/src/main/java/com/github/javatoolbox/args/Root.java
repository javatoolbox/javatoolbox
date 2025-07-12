package com.github.javatoolbox.args;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/// Indicates that a {@link Command} is the *root command*.
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Root {
    String name();

    String description() default "";
}
