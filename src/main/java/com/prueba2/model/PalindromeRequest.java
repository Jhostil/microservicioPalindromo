package com.prueba2.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Modelo de solicitud para procesar una frase")
public class PalindromeRequest {

    @Schema(description = "La frase que se desea procesar", example = "Anita lava la tina")
    private String palindromo;
}
