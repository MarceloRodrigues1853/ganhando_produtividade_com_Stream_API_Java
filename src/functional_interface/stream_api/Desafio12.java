package functional_interface.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Desafio 12 - Encontre o produto de todos os números da lista:
// Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
public class Desafio12 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar o produto de todos os números da lista
        Optional<Integer> produto = numeros.stream()
                .reduce((n1, n2) -> n1 * n2); // Reduzir multiplicando os elementos

        // Exibir o resultado no console
        if (produto.isPresent()) {
            System.out.println("O produto de todos os números da lista é: " + produto.get());
        } else {
            System.out.println("A lista está vazia, não é possível calcular o produto.");
        }
    }
}
