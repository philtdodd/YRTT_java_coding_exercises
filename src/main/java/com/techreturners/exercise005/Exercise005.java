package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        int letterCount[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < input.length(); i++)
        {
            char c = input.toLowerCase().charAt(i);
            System.out.print(c);
            if ((int)c >= (int)'a' && (int)c <= (int)'z')
                letterCount['z' - (int)c]++;
        }

        for (int i = 0; i < 26; i++)
        {
            if (letterCount[i] == 0)
                return false;
        }

        return true;
    }

}
