package br.com.alura;

import java.util.List;

public class CalculandoOTotalDomImposto {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);
        double totalImposto = precosProdutos.stream()
                .map(preco -> preco * 0.2) // Calcula 20% de imposto
                .reduce(0.0, Double::sum); // Soma todos os impostos, reduce e usado para somar os valores
        System.out.println("Total de imposto: " + totalImposto);
    }
}
