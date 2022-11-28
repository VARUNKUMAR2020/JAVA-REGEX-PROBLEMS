package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProblem {
    static final String firstNamePattern = "^[A-Z][a-z]{2,}";

    // UseCase1 : Validate first name.
    public static void validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean matchFound = matcher.find();
        if (matchFound)
            System.out.println("Match Found.");
        else
            System.out.println("Match Not Found.");
    }

    public static void main(String[] args) {
        System.out.println("Regex Problems");
        
        // UseCase1 : Validate first name.
        String firstName = "Varun";
        validateFirstName(firstName);
    }
}
