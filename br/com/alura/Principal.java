package br.com.alura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
//getFirst() retorna o primeiro elemento da lista
//getLast() retorna o último elemento da lista
//get(int index) retorna o elemento na posição especificada
//getFirst() e getLast() são métodos que podem ser usados em listas que implementam a interface Deque, como LinkedList
//No caso de ArrayList, usamos get(index) para acessar elementos específicos
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("João");

        System.out.println("Funcionários: " + funcionarios.getFirst()); // usando getFirst() para obter o primeiro
        System.out.println("Funcionários: " + funcionarios.getLast()); // usando getLast() para obter o último
        System.out.println("Funcionários: " + funcionarios.get(1)); // usando get(index



        //usando o set
        // HashSet é uma implementação de Set que não permite duplicatas
        Set<String> produtos = new HashSet<>(); // Set não permite duplicatas, então "Notebook" só será adicionado uma vez
        produtos.add("Notebook");
        produtos.add("Mouse");
        produtos.add("Teclado");

        System.out.println("Produtos: " + produtos); // imprimindo o conjunto de produtos



        //usando o map
        // Map não é usado diretamente aqui, mas poderia ser usado para associar produtos a preços, por exemplo
        // Exemplo de uso de Map para associar IDs a nomes de clientes

        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Carlos");
        clientes.put(2, "Ana");
        clientes.put(3, "Carlos"); // Chave 3 associada ao mesmo nome

        System.out.println(clientes);// imprimindo o mapa de clientes

        System.out.println("Clientes: " + clientes.get(1)); // acessando o cliente com chave 1
        System.out.println("Clientes: " + clientes.get(2)); // acessando o cliente com chave 2
        System.out.println("Clientes: " + clientes.get(3)); // acessando o cliente com chave 3
    }
}
