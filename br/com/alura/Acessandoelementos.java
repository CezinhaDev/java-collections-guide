package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class Acessandoelementos {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");

        // Acessando elementos da lista
        System.out.println("Primeiro funcionário: " + funcionarios.get(1)); // Acessa o segundo elemento (índice 1)
        System.out.println("Total de funcionários: " + funcionarios.size()); // Tamanho da lista

        // Verificando se um elemento existe na lista
        if (funcionarios.contains("Maria")) { // contains verifica se o elemento está na lista
            System.out.println("Maria está na lista.");
        } else {
            System.out.println("Maria não está na lista.");
        }
    }
}
