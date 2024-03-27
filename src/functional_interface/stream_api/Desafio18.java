package functional_interface.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 18 - Verifique se todos os números da lista são iguais:
// Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
public class Desafio18 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificar se todos os números da lista são iguais
        boolean todosIguais = numeros.stream()
                .distinct() // Remover duplicatas
                .count() == 1; // Verificar se restou apenas um elemento

        // Exibir o resultado no console
        if (todosIguais) {
            System.out.println("Todos os números da lista são iguais.");
        } else {
            System.out.println("Os números da lista não são todos iguais.");
        }
    }
}
