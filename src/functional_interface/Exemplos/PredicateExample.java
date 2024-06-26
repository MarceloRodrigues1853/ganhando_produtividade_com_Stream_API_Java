package functional_interface.Exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
    public static void main(String[] args) {
        // Criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        // Criar um Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Criar um Predicate que verifica se a palavra tem menos  de 5 caracteres
        Predicate<String> menosDeCincoCaracteres = palavra -> palavra.length() < 5;


        // Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro
        System.out.println("Palavras com mais de 5 caracteres:");
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);

        // Adicionar uma linha em branco entre as duas seções de impressão
        System.out.println();

        // Usar o Stream para filtrar as palavras com menos de 5 caracteres e, em seguida,
        // imprimir cada palavra que passou no filtro
        System.out.println("Palavras com menos de 5 caracteres:");
        palavras.stream()
                .filter(menosDeCincoCaracteres)
                .forEach(System.out::println);
    }
}
