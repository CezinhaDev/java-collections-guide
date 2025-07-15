package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class Verificandoeahaveexiste {
    public static void main(String[] args) {
        Map<String, String> clientes = new HashMap<>();
        clientes.put("1", "Carlos");
        clientes.put("2", "Ana");
        clientes.put("3", "João");

        System.out.println("Lista de clientes: " + clientes);

        int IdDoCliente = 6; // ID do cliente a ser verificado
        if (clientes.containsKey(String.valueOf(IdDoCliente))) { // containesKey verifica se a chave existe && valueOf converte o ID para String
            System.out.println("Cliente com ID " + IdDoCliente + " existe: " + clientes.get(String.valueOf(IdDoCliente)));
        } else {
            System.out.println("Cliente com ID " + IdDoCliente + " não existe.");
        }

        
    }
}
