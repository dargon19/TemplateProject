package com.md.training1;

public class QueryFormatter {
    public static String format(String str) {
        if(str.startsWith("\"") && str.endsWith("\"")){
            return str;
        }
        return str.toLowerCase().replace("-", "\\-").replace("\\\\", "\\");
    }
}
