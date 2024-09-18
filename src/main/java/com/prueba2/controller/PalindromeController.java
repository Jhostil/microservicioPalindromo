package com.prueba2.controller;

import com.prueba2.model.PalindromeRequest;
import com.prueba2.model.PalindromeResponse;
import com.prueba2.service.PalindromeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class PalindromeController {

    @PostMapping("/processPhrase")
    public ResponseEntity<?> processPalindrome(@RequestBody PalindromeRequest request) {

        String phrase = request.getPalindromo();
        String phraseWithoutSpaces = PalindromeService.deleteSpaces(phrase);
        boolean isPalindrome = PalindromeService.isPalindrome(phraseWithoutSpaces);
        int lengthPhrase = PalindromeService.getLength(phrase);
        int totalSpecialCharacters = PalindromeService.countSpecialCharacters(phrase);

        PalindromeResponse response = new PalindromeResponse(isPalindrome, lengthPhrase, totalSpecialCharacters);

        return ResponseEntity.ok(response);
    }
}
