package functional_interface.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
// Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
public class Desafio9 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se todos os números da lista são distintos
        boolean saoDistintos = numeros.stream()
                .distinct() // Remover duplicatas
                .count() == numeros.size(); // Verificar se o número de elementos distintos é igual ao tamanho da lista original

        // Exibir o resultado no console
        if (saoDistintos) {
            System.out.println("Todos os números da lista são distintos.");
        } else {
            System.out.println("Existem números repetidos na lista.");
        }
    }
}
