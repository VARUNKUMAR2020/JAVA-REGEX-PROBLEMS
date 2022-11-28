package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexProblem {
    static final String firstNamePattern = "^[A-Z][a-z]{2,}";
    static final String lastNamePattern = "^[A-Z][a-z]{2,}";
    static final String emailPattern = "^[a-z0-9]+[.]?[a-z0-9]*@[a-z0-9]+[.][a-z]+([.]?[a-z])*";

    // UseCase1 : Validate first name.
    public static void validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean matchFound = matcher.find();
        if (matchFound)
            System.out.println("First Name Match Found.");
        else
            System.out.println("First Name Match Not Found.");
    }

    // UseCase2 : Validate last name.
    public static void validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean matchFound = matcher.find();
        if (matchFound)
            System.out.println("Last Name Match Found.");
        else
            System.out.println("Last Name Match Not Found.");
    }

    // UseCase3 : Validate email.
    public static void validateEmail(String email) {
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();
        if (matchFound)
            System.out.println("Email Match Found.");
        else
            System.out.println("Email Match Not Found.");
    }

    public static void main(String[] args) {
        System.out.println("Regex Problems");

        // UseCase1 : Validate first name.
        String firstName = "Varun";
        validateFirstName(firstName);

        // UseCase2 : Validate last name.
        String lastName = "Kumar";
        validateLastName(lastName);

        // UseCase3 : Validate email.
		String email = "varunvenkat2020@gmail.com";
		validateEmail(email);
    }
}
