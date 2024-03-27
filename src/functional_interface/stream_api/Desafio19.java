package functional_interface.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
// Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3
// quanto por 5 e exiba o resultado no console.
public class Desafio19 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrar a soma dos números divisíveis por 3 e 5
        int somaDivisiveis = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0) // Filtrar os divisíveis por 3 e 5
                .mapToInt(Integer::intValue) // Converter para int
                .sum(); // Somar os resultados

        // Exibir o resultado no console
        System.out.println("A soma dos números divisíveis por 3 e 5 é: " + somaDivisiveis);
    }
}
