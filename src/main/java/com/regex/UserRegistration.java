package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static final String firstNamePattern = "^[A-Z][a-z]{2,}";
    static final String lastNamePattern = "^[A-Z][a-z]{2,}";
    static final String emailPattern = "^[a-z0-9]+([.+_-]?[a-z0-9]+)?@{1}[a-z0-9]+[.]([a-z0-9]+[.])?[a-z]{2,}";
    static final String phoneNumberPattern = "^[0-9]{1,2}\\s[0-9]{10}";
    static final String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*?&]{1})[A-Za-z0-9@$!%*?&]{8,}";

    // UseCase1 : Validate first name.
    public static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcher = pattern.matcher(firstName);
        boolean matchFound = matcher.find();
        return matchFound;
    }
    

    // UseCase2 : Validate last name.
    public static boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(lastNamePattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean matchFound = matcher.find();
        return matchFound;
    }

    // UseCase 3 & 9 : Validate email.
    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();
        return matchFound;
    }

    // UseCase4 : Validate phone number.
    public static boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(phoneNumberPattern);
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean matchFound = matcher.find();
        return matchFound;
    }

    // UseCase 5 & 6 & 7 & 8 : Validate password.
    public static boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);
        boolean matchFound = matcher.find();
        return matchFound;
    }

    // Test case.
    public String userRegistrationValidation(String firstName, String lastName, String email, String phoneNumber,
            String password) {
        if (validateFirstName(firstName) && validateLastName(lastName) && validateEmail(email)
                && validatePhoneNumber(phoneNumber) && validatePassword(password)) {
            return "Happy";
        } else {
            return "Sad";
        }
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

        // UseCase4 : Validate phone number.
        String phoneNumber = "91 8870187077";
        validatePhoneNumber(phoneNumber);

        // UseCase 5 & 6 & 7 & 8 : Validate password- minimum eight characters & 1 upper
        // case & 1 numeric & 1 special character
        String password = "VarunVenkat@1";
        validatePassword(password);

        // UseCase9 : Validate email for all valid and invalid samples.
        email = "varunvenkat2020@gmail.com"; // given valid sample
        validateEmail(email);
        email = "varun@venkat@gmail.com"; // given invalid sample
        validateEmail(email);
    }
}
