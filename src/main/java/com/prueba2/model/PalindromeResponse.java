package com.prueba2.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(description = "Modelo de respues que contiene los resultados del procesamiento de la frase")
public class PalindromeResponse {

    @Schema(description = "Indica si la frase es un palíndromo", example = "true")
    private boolean isPalindrome;
    @Schema(description = "Indica la longitus de la frase", example = "15")
    private int lengthPhrase;
    @Schema(description = "Indica el total de caracteres especiales presente en la frase", example = "5")
    private int totalSpecialCharacters;
}
