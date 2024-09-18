package com.prueba2.service;

public class PalindromeService {

    public static boolean isPalindrome(String phrase) {
        String phraseWithoutSpaces = PalindromeService.deleteSpaces(phrase);
        phrase = phraseWithoutSpaces.toLowerCase();

        String reversePhrase = new StringBuilder(phrase).reverse().toString();
        System.out.println("Normal:" + phrase);
        System.out.println("Invertida: " + reversePhrase);

        return phrase.equals(reversePhrase);
    }

    public static int countSpecialCharacters(String phrase) {
        int count = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char character  = phrase.charAt(i);

            if(!Character.isLetterOrDigit(character) && character != ' ') {
                count++;
            }
        }
        return count;
    }

    public static int getLength(String phrase) {
        return phrase.length();
    }

    public static String deleteSpaces(String phrase) {
        StringBuilder newPhrase = new StringBuilder();

        for (int i = 0; i < phrase.length(); i++) {
            char character = phrase.charAt(i);

            if( Character.isLetterOrDigit(character)){
                newPhrase.append(character);
            }
        }
        return newPhrase.toString();
    }

}
