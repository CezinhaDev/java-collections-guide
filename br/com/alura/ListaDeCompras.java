package br.com.alura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> itens = new ArrayList<>();

        System.out.println("Digite os itens da lista (digite 'fim' para encerrar):");

        while (true) {
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("fim")) { // equalIgnoreCase para ignorar maiúsculas/minúsculas
                break;
            }

            itens.add(item);
        }

        System.out.println("\nItens da lista:");
        for (String i : itens) {
            System.out.println("- " + i);
        }

        scanner.close();
    }
}
