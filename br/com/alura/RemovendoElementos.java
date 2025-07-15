package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class RemovendoElementos {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");

        System.out.println("Lista de funcionários: " + funcionarios);

        // Removendo um funcionário
        funcionarios.remove("Vitor");
        System.out.println("Lista de funcionários após remoção: " + funcionarios);
    }
}
