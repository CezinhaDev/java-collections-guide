package br.com.alura;

import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("João", "Maria", "José", "Ana", "Pedro");
        // Exemplo de uso de streams para filtrar e imprimir nomes que começam com a
        // letra 'J'

        List<String> funcionariosLetraJ = funcionarios.stream()
                .filter(f -> f.startsWith("J"))
                .collect(Collectors.toList());

        System.out.println(funcionarios);

        System.out.println("Funcionarios com letra J: " + funcionariosLetraJ);

        List<Double> valoresVendas = List.of(1500.0, 2300.5, 3200.75, 1800.0, 2100.0);
        // Exemplo de uso de streams para calcular a média das vendas

        List<Double> comissao = valoresVendas.stream()
                .map(v -> v * 0.1) // Calcula 10% de comissão
                .collect(Collectors.toList());

        System.out.println("Valores de vendas: " + valoresVendas);
        System.out.println("Comissões: " + comissao);

        double totalVendas = valoresVendas.stream()
                .reduce(0.0, Double::sum); // Soma total das vendas
        System.out.println("Total de vendas: " + totalVendas);
    }
}
