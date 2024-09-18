package com.prueba2.service;

/**
 * Clase que contiene la lógica para procesar una caena y determiar si es palíndromo, la longitud de la cadena
 * y el total de caracteres especiales que hay en la cadena
 */
public class PalindromeService {

    /**
     * Método que evalúa si una cadena es un palíndromo o no.
     * Ignora los espacios y no distingue entre mayúsculas y minúsculas.
     *
     * @param phrase Cadena de texto que se va a evaluar. No distingue entre mayúsculas, minúsculas ni espacios.
     * @return Retorna true si la cadena es un palíndromo, o false en caso contrario.
     */
    public static boolean isPalindrome(String phrase) {
        String phraseWithoutSpaces = PalindromeService.deleteSpaces(phrase);
        phrase = phraseWithoutSpaces.toLowerCase();

        String reversePhrase = new StringBuilder(phrase).reverse().toString();

        return phrase.equals(reversePhrase);
    }

    /**
     * Método que permite obtener el total de caracteres especiales.
     * Se toma por caracter especial a cualquier caracter diferente a número, letra o espacio.
     * @param phrase Cadena de texto a la cual se le van a contar el total de caracteres especiales presentes.
     * @return Retorna un número entero que representa el total de caracteres especiales presentes en la cadena
     */
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

    /**
     * Método que permite obtener la longitud de una cadena
     * @param phrase Cadena a la cual se le va a obtener la longitud
     * @return Retorna un entero con la longitud de la cadena
     */
    public static int getLength(String phrase) {
        return phrase.length();
    }

    /**
     * Método que permite eliminar todos los espacios presentes en una cadena
     * @param phrase Cadena a la cual se le van a eliminar los espacios
     * @return Retorna un String con la nueva cadena la cual no contien espacios
     */
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
