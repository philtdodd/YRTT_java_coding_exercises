package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.substring(0, 1).toUpperCase() + "." + lastName.substring(0, 1).toUpperCase();
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        int vatPence = ((int)(originalPrice * vatRate));
        return originalPrice + vatPence / 100.0;
    }

    public String reverse(String sentence) {
        // Add your code here
        StringBuilder returnValue = new StringBuilder();

        for (int i = sentence.length() - 1; i >= 0; i--)
        {
            returnValue.append(sentence.charAt(i));
        }
        return returnValue.toString();
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        int returnValue = 0;
        for (User user : users)
        {
            if (user.getType().compareTo("Linux") == 0)
                returnValue++;
        }

        return returnValue;
    }
}
