package com.prueba2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PalindromeResponse {

    private boolean isPalindrome;
    private int lengthPhrase;
    private int totalSpecialCharacters;
}
