package functional_interface.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Desafio 13 - Filtrar os números que estão dentro de um intervalo:
// Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
public class Desafio13 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Definir o intervalo
        int inicioIntervalo = 5;
        int fimIntervalo = 10;

        // Filtrar os números dentro do intervalo
        List<Integer> numerosNoIntervalo = numeros.stream()
                .filter(n -> n >= inicioIntervalo && n <= fimIntervalo)
                .collect(Collectors.toList());

        // Exibir o resultado no console
        System.out.println("Números dentro do intervalo [" + inicioIntervalo + ", " + fimIntervalo + "]:");
        System.out.println(numerosNoIntervalo);
    }
}
