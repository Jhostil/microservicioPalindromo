package com.prueba2;

import com.prueba2.controller.PalindromeController;
import com.prueba2.model.PalindromeRequest;
import com.prueba2.model.PalindromeResponse;
import com.prueba2.service.PalindromeService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class PalindromeTest {

    private PalindromeController palindromeController;

    @BeforeEach
    public void setup(){
        palindromeController = new PalindromeController();
    }

    @Test
    public void testPalindrome(){

        PalindromeRequest request = new PalindromeRequest();
        request.setPalindromo(" A ti no,* bonita ");

        ResponseEntity<?> responseEntity = palindromeController.processPalindrome(request);

        PalindromeResponse response = (PalindromeResponse) responseEntity.getBody();

        assertEquals(true, response.isPalindrome());
        assertEquals(18, response.getLengthPhrase());
        assertEquals(2, response.getTotalSpecialCharacters());

    }

}
