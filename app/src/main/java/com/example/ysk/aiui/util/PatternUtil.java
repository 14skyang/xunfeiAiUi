package com.example.ysk.aiui.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternUtil {

    private static final String REGEX_TRAIN = "\\[[a-z]\\d\\]";

    public static String matchTrain(String input) {
        Pattern pattern = Pattern.compile(REGEX_TRAIN);
        Matcher matcher = pattern.matcher(input);
        StringBuffer sb = new StringBuffer(input.length());
        while (matcher.find()) {
            matcher.appendReplacement(sb, "");
        }
        matcher.appendTail(sb);
        return sb.length() == input.length() ? input : sb.toString();
    }
}

