package com.prueba2.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Clase que representa la estructura de la respuesta que se envía al cliente después de procesar una cadena
 */
@Data
@AllArgsConstructor
@Schema(description = "Modelo de respues que contiene los resultados del procesamiento de la frase")
public class PalindromeResponse {

    /**
     * Indíca si la frase es políndromo (true) o no (false)
     */
    @Schema(description = "Indica si la frase es un palíndromo", example = "true")
    private boolean isPalindromo;
    /**
     * Indica el tamaño de la cadena
     */
    @Schema(description = "Indica la longitud de la frase", example = "15")
    private int lengthCadena;
    /**
     * Indica el total de caracteres especiales que tiene la cadena
     */
    @Schema(description = "Indica el total de caracteres especiales presentes en la frase", example = "5")
    private int lengthCaracteresExpeciales;
}
