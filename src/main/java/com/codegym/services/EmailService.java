package com.codegym.services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailService {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    static {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public static boolean validate (String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
