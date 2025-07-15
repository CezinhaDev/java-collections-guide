package br.com.alura;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListasemDuplicados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> nomes = new HashSet<>();

        System.out.println("Digite  6 nomes: (digite 'fim' para encerrar):");

        while(nomes.size() < 6){ // O método .size() é usado para saber quantos elementos tem em uma coleção
            String nome = scanner.nextLine();

            if(nome.equalsIgnoreCase("fim")) { // equalIgnoreCase para ignorar maiúsculas/minúsculas
                break;
            }
            nomes.add(nome);
        }

        System.out.println("Nomes digitados:");
        for (String n : nomes) {
            System.out.println(n);
        }
    }
}
