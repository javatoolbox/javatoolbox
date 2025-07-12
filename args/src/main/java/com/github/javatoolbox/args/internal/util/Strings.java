package com.github.javatoolbox.args.internal.util;

public final class Strings {

    public static String convertCamelToKebab(String camel) {
        if (camel == null) throw new IllegalArgumentException();
        final var buf = new StringBuilder();
        for (char ch : camel.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                buf.append('-');
                buf.append(Character.toLowerCase(ch));
            } else {
                buf.append(ch);
            }
        }
        return buf.toString();
    }

    private Strings() { throw new UnsupportedOperationException(); }
}
