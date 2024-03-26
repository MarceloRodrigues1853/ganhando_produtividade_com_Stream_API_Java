package functional_interface.Exemplos;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierExample {
    public static void main(String[] args) {
        // Exemplo 1: Fornecer uma mensagem de boas-vindas padrão
        Supplier<String> saudacaoPadrao = () -> "Olá, seja bem-vindo(a)!";

        // Obter uma lista com 5 saudações padrão
        List<String> saudacoesPadrao = Stream.generate(saudacaoPadrao)
                .limit(5)
                .toList();

        // Imprimir as saudações padrão geradas
        System.out.println("Saudações padrão:");
        saudacoesPadrao.forEach(System.out::println);

        // Exemplo 2: Fornecer um número aleatório entre 1 e 100
        Supplier<Integer> numeroAleatorio = () -> (int) (Math.random() * 100) + 1;

        // Obter uma lista com 10 números aleatórios
        List<Integer> numerosAleatorios = Stream.generate(numeroAleatorio)
                .limit(10)
                .collect(Collectors.toList());

        // Imprimir os números aleatórios gerados
        System.out.println("\nNúmeros aleatórios:");
        numerosAleatorios.forEach(System.out::println);

        // Exemplo 3: Fornecer uma lista de cores padrão
        Supplier<List<String>> coresPadrao = () -> List.of("Vermelho", "Verde", "Azul");

        // Obter a lista de cores padrão
        List<String> listaCoresPadrao = coresPadrao.get();

        // Imprimir as cores padrão
        System.out.println("\nCores padrão:");
        listaCoresPadrao.forEach(System.out::println);
    }
}
