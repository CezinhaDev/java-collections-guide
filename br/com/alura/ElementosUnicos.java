package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ElementosUnicos {
    public static void main(String[] args) {
        Set<String> produtos = new HashSet<>();

        System.out.println("Produtos disponíveis:");
        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Macarrão");
        produtos.add("Açúcar");
        produtos.add("Sal");
        produtos.add("Arroz"); // Tentativa de adicionar um produto duplicado

        System.out.println("Lista de produtos: " + produtos); // Exibe a lista de produtos únicos
        System.out.println("Total de produtos únicos: " + produtos.size()); // Exibe o total de produtos únicos
    }
}
