package com.regex;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.testng.xml.Parameters;

public class TestUserRegistration {

    @Test
    public void givenCorrectDetailsReturnHappy() {
        UserRegistration validate = new UserRegistration();
        String result = validate.userRegistrationValidation("Tekesh", "Singh", "tekesh.singh@gmail.co.in",
                "91 1234567890", "Tekesh1Singh@");
        assertEquals("Happy", result);
    }

    @Test
    public void givenIncorrectDetailsReturnSad() {
        UserRegistration validate = new UserRegistration();
        String result = validate.userRegistrationValidation("tekesh", "singh", "tekesh-Singh@gmail.co.in1",
                "919087654321", "Tekesh@");
        assertEquals("Sad", result);
    }

    @RunWith(Parameterized.class)
    public class EmailAddressTest {
        private String email;
        private boolean expectedResult;

        // Each parameter should be placed as an argument here
        // Every time runner triggers, it will pass the arguments
        // from parameters we defined in primeNumbers() method
        public EmailAddressTest(String email, boolean expectedResult) {
            this.email = email;
            this.expectedResult = expectedResult;
        }

        @Parameterized.Parameters
        public Collection emails() {
            return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
                    { "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
                    { "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
                    { "abc+100@gmail.com", true },

                    { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false }, { "abc123@.com", false },
                    { "abc123@.com.com", false }, { ".abc@abc.com", false }, { "abc()*@gmail.com", false },
                    { "abc@%*.com", false }, { "abc..2002@gmail.com", false }, { "abc.@gmail.com", false },
                    { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false }, { "abc@gmail.com.aa.au", false } });
        }
    }
}
