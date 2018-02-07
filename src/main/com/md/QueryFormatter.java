package com.md;

public class QueryFormatter {
    public static String format(String str) {
        return str.toLowerCase().replace("-", "\\-").replace("\\\\", "\\");
    }
}
