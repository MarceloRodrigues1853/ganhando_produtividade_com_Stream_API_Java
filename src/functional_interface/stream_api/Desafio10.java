package functional_interface.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
// Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
public class Desafio10 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Agrupar os valores ímpares múltiplos de 3 ou de 5
        Map<Boolean, List<Integer>> agrupados = numeros.stream()
                .filter(n -> n % 2 != 0) // Filtrar os valores ímpares
                .filter(n -> n % 3 == 0 || n % 5 == 0) // Filtrar os múltiplos de 3 ou de 5
                .collect(Collectors.partitioningBy(n -> n % 3 == 0)); // Agrupar pela condição de ser múltiplo de 3

        // Exibir o resultado no console
        System.out.println("Valores ímpares múltiplos de 3 ou de 5:");
        System.out.println("Múltiplos de 3: " + agrupados.get(true));
        System.out.println("Múltiplos de 5: " + agrupados.get(false));
    }
}
