package functional_interface.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 6 - Verificar se a lista contém algum número maior que 10:
// Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
public class Desafio6 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se a lista contém algum número maior que 10
        boolean contemMaiorQue10 = numeros.stream()
                .anyMatch(n -> n > 10);

        // Exibir o resultado no console
        if (contemMaiorQue10) {
            System.out.println("A lista contém números maiores que 10.");
        } else {
            System.out.println("A lista não contém números maiores que 10.");
        }
    }
}
