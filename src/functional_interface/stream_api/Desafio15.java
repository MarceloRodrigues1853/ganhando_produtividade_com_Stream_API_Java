package functional_interface.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
// Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
public class Desafio15 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se a lista contém pelo menos um número negativo
        boolean contemNegativo = numeros.stream()
                .anyMatch(n -> n < 0);

        // Exibir o resultado no console
        if (contemNegativo) {
            System.out.println("A lista contém pelo menos um número negativo.");
        } else {
            System.out.println("A lista não contém números negativos.");
        }
    }
}
