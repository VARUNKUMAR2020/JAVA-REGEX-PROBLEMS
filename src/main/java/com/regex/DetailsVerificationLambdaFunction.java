package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Verify {
	boolean verify(String regex, String details);

	static void output(Verify obj, String regex, String details) {
		if (obj.verify(regex, details)) {
			System.out.println("'" + details + "' Valid Detail");
		} else {
			System.out.println("'" + details + "' Invalid Detail");
		}
	}
}

public class DetailsVerificationLambdaFunction {

	public static void main(String[] args) {
		// Creating the reference of the interface with the Lambda Expression.
		Verify detailVerification = Pattern::matches;

		// Validation of user details by Lambda Function..
		System.out.println("\nFirst Name");
		Verify.output(detailVerification, "^[A-Z][a-z]{2,}", "Varun");
		Verify.output(detailVerification, "^[A-Z][a-z]{2,}", "varun");

		System.out.println("\nLast Name");
		Verify.output(detailVerification, "^[A-Z][a-z]{2,}", "Kumar");
		Verify.output(detailVerification, "^[A-Z][a-z]{2,}", "kumar");

		System.out.println("\nEmail ID");
		Verify.output(detailVerification, "^[a-z0-9]+([.+_-]?[a-z0-9]+)?@[a-z0-9]+[.]([a-z0-9]+[.])?[a-z]{2,}",
				"varunvenkat@gmail.com");
		Verify.output(detailVerification, "^[a-z0-9]+([.+_-]?[a-z0-9]+)?@[a-z0-9]+[.]([a-z0-9]+[.])?[a-z]{2,}",
				"varunKumar@gmail.com");

		System.out.println("\nPhone Number");
		Verify.output(detailVerification, "^[0-9]{1,2} [0-9]{10}", "91 1234567890");
		Verify.output(detailVerification, "^[0-9]{1,2} [0-9]{10}", "919087654321");

		System.out.println("\nPassword");
		Verify.output(detailVerification, "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}", "Varun@123");
		Verify.output(detailVerification, "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}", "Var");
	}
}
