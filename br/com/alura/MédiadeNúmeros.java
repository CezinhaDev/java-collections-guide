package br.com.alura;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MédiadeNúmeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Digite os números (digite -1 para encerrar):");

        while(true){ // while é usadp para repetir a entrada de números, quando o usuário digitar -1, o loop será encerrado
            int numero = scanner.nextInt();

            if(numero == -1) { // -1 para encerrar a entrada de números
                break;
            }

            numeros.add(numero);
        }

        // Cálculo da média
        double soma = 0;
        for (int n : numeros) {
            soma += n;
        }
        double media = soma / numeros.size(); //size() retorna o número de elementos na lista

        System.out.println("A média é: " + media);
    }
}
