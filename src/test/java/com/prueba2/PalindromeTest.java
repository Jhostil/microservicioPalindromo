package com.prueba2;

import com.prueba2.controller.PalindromeController;
import com.prueba2.model.PalindromeRequest;
import com.prueba2.model.PalindromeResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase que permite ejecutar tests a la aplicación
 */
public class PalindromeTest {

    /**
     * Varaible que representa una referencia al controlador
     */
    private PalindromeController palindromeController;

    /**
     * Método que permite inicializar el controlador antes de ejecutar las pruebas
     */
    @BeforeEach
    public void setup(){
        palindromeController = new PalindromeController();
    }

    /**
     * Método que permite ejecutar un test para verificar el correcto funcionamiento de la lógica de la aplicación
     * Este método verifica si una cadena es palíndromo, el tamaño de la cadena y el total de caracteres especiales presentes en la cadena.
     */
    @Test
    public void testPalindrome(){

        PalindromeRequest request = new PalindromeRequest();
        request.setPalindromo(" A ti no,* bonita ");

        ResponseEntity<?> responseEntity = palindromeController.processPalindrome(request);

        PalindromeResponse response = (PalindromeResponse) responseEntity.getBody();

        assertEquals(true, response.isPalindromo());
        assertEquals(18, response.getLengthCadena());
        assertEquals(2, response.getLengthCaracteresExpeciales());

    }

}
