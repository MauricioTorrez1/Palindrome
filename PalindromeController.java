package com.PracticaPropuesta1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador para verificar palindromos
 */

@RestController //Controlador de tipo REST los encargados de comunicarse con las peticiones HTTP y dar una respuesta
//Y no deben de llevar la lógica
public class PalindromeController {
    /**
     * Endpoint para verificar si una palabra es un palindromo
     * @param word la palabra a verificar
     * @return un mensaje indicando si la palabra es un palindromo o no.
     */
    //GetMapping para asignar URL
    //Y PathVariable para asignar la variable a la dirección URL
    @GetMapping("/validar-palindromo/{word}")
    public String Palindrome(@PathVariable String word){
        if (isPalindrome(word)){
            return "La palabra " + word + " es un palindromo" ;
        }
        else {
            return "La palabra " + word + " NO es un palindromo";
        }
    }

    /**
     * Método para verificar si una palabra es un palindromo
     * @param word la palabra a verificar
     * @return un mensaje indicando si la palraba es un palindromo o no.
     */
    private boolean isPalindrome(String word){
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)){
                return false;
            }
        }
        return true;
    }

}
