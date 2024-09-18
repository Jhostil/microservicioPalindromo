package com.prueba2.controller;

import com.prueba2.model.PalindromeRequest;
import com.prueba2.model.PalindromeResponse;
import com.prueba2.service.PalindromeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Clase que controla las peticiones que llegan al EndPoint
 */
@RestController
@RequestMapping("/api/")
@Tag(name = "API-Palíndromo", description = "Operación relacionada con el procesamiento de palíndromos")
public class PalindromeController {

    /**
     * EndPoint que procesa las peticiones tipo POST de la API
     * @param request Parámetro de tipo PalindromeRequest el cual contiene un JSON con la cadena a procesar
     * @return Retorna un RsponseEntity el cual contiene en el body la respuesta obtenida al procesar la cadena
     */
    @PostMapping("/processPhrase")
    @Operation(summary = "Procesa una drase para determinar si es palíndromo",
    description = "Este endpoint recibe una frase, verifica si es un palíndromo, calcula la longitud de la frase y el número de caracteres especiales")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Frase procesada correctamente", content = @io.swagger.v3.oas.annotations.media.Content(mediaType = "application/json", schema = @io.swagger.v3.oas.annotations.media.Schema(implementation = PalindromeResponse.class))),
            @ApiResponse(responseCode = "400", description = "Solicitud inválida"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    public ResponseEntity<?> processPalindrome(@RequestBody PalindromeRequest request) {

        String phrase = request.getPalindromo();

        boolean isPalindrome = PalindromeService.isPalindrome(phrase);
        int lengthPhrase = PalindromeService.getLength(phrase);
        int totalSpecialCharacters = PalindromeService.countSpecialCharacters(phrase);

        PalindromeResponse response = new PalindromeResponse(isPalindrome, lengthPhrase, totalSpecialCharacters);

        return ResponseEntity.ok(response);
    }
}
