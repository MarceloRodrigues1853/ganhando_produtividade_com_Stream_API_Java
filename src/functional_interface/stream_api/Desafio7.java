package functional_interface.stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// Desafio 7 - Encontrar o segundo número maior da lista:
// Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
public class Desafio7 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar o segundo número maior da lista
        Optional<Integer> segundoMaior = numeros.stream()
                .distinct() // Remover duplicatas
                .sorted(Comparator.reverseOrder()) // Ordenar em ordem decrescente
                .skip(1) // Ignorar o maior número
                .findFirst(); // Encontrar o segundo maior

        // Exibir o resultado no console
        if (segundoMaior.isPresent()) {
            System.out.println("O segundo número maior da lista é: " + segundoMaior.get());
        } else {
            System.out.println("Não há segundo número maior na lista.");
        }
    }
}
