package functional_interface.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Desafio 14 - Encontre o maior número primo da lista:
// Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
public class Desafio14 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar o maior número primo da lista
        Optional<Integer> maiorPrimo = numeros.stream()
                .filter(Desafio14::ehPrimo) // Filtrar os números primos
                .max(Integer::compareTo); // Encontrar o máximo

        // Exibir o resultado no console
        if (maiorPrimo.isPresent()) {
            System.out.println("O maior número primo da lista é: " + maiorPrimo.get());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    // Método para verificar se um número é primo
    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
