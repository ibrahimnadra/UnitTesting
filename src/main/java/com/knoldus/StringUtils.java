package com.knoldus;

public class StringUtils {

    //returns true if the input string is empty, false otherwise
    public Boolean isEmpty(String inputString){
        return inputString.length() == 0;
    }

    //validate method to throw exception for empty string
    public void validateString(String inputString) throws EmptyStringException {
        if(isEmpty(inputString)){
            throw new EmptyStringException();
        }
    }

    //returns the reverse of the input string
    public String reverse(String inputString) throws EmptyStringException {
        //if the string is empty
        if(isEmpty(inputString)) validateString(inputString);
        String reversedString = "";
        Character character;
        for (Integer index = 0; index < inputString.length(); index++)
        {
            //extracts each character
            character = inputString.charAt(index);
            //adds each character in front of the existing string
            reversedString = character + reversedString;
        }
        return reversedString;
    }

    //returns true if the input string is a palindrome, false otherwise
    public Boolean isPalindrome(String inputString) throws EmptyStringException {
        //if the string is empty
        if(isEmpty(inputString))   validateString(inputString);
        //compared the strings without using inbuilt equals method
        return isEqual(inputString, reverse(inputString));
    }

    //returns true if the passed strings are equal, false otherwise
    public Boolean isEqual(String firstString, String secondString ){
        Integer minimumLength = Math.min(firstString.length(), secondString.length());

        // Edge case for strings like
        // first string = "Nadra" and second String = "NadraIbrahim"
        if (firstString.length() != secondString.length()) {
            return false;
        }

        else{
            for (Integer i = 0; i < minimumLength; i++) {
                Character firstCharacter = firstString.charAt(i);
                Character secondCharacter = secondString.charAt(i);

                if (firstCharacter != secondCharacter)
                    return false;
            }

            // If none of the above conditions is true,
            // it implies both the strings are equal
            return true;
        }
    }
}

