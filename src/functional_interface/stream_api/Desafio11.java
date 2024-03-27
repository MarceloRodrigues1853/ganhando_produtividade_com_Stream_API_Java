package functional_interface.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
// Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
public class Desafio11 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar a soma dos quadrados de todos os números da lista
        int somaQuadrados = numeros.stream()
                .mapToInt(n -> n * n) // Elevar ao quadrado
                .sum(); // Somar os quadrados

        // Exibir o resultado no console
        System.out.println("A soma dos quadrados de todos os números da lista é: " + somaQuadrados);
    }
}
