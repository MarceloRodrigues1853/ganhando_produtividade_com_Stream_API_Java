package functional_interface.stream_api;

import java.util.Arrays;
import java.util.List;

// Desafio 8 - Somar os dígitos de todos os números da lista:
// Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
public class Desafio8 {
    public static void main(String[] args) {
        // Lista de números fornecida
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Somar os dígitos de todos os números da lista
        int somaDigitos = numeros.stream()
                .mapToInt(Desafio8::somaDigitos) // Mapear para a soma dos dígitos
                .sum(); // Somar todas as somas de dígitos

        // Exibir o resultado no console
        System.out.println("A soma dos dígitos de todos os números da lista é: " + somaDigitos);
    }

    // Método para calcular a soma dos dígitos de um número
    private static int somaDigitos(int numero) {
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }
}
