package functional_interface.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Desafio 17 - Filtrar os números primos da lista:
// Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
public class Desafio17 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrar os números primos da lista
        List<Integer> primos = numeros.stream()
                .filter(Desafio17::ehPrimo) // Filtrar os números primos
                .collect(Collectors.toList()); // Coletar os resultados em uma lista

        // Exibir o resultado no console
        System.out.println("Números primos: " + primos);
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
