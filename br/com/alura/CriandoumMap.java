package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class CriandoumMap {
    public static void main(String[] args) {
        Map<String, String> clientes = new HashMap<>();
        clientes.put("1", "Carlos");
        clientes.put("2", "Ana");
        clientes.put("3", "João");

        System.out.println("Lista de clientes: " + clientes.get("1")); // Acessa o cliente com ID 1
        System.out.println("Total de clientes: " + clientes.size()); // Exibe o total
    }
}
