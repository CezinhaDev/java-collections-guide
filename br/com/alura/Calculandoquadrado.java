package br.com.alura;

import java.util.Arrays;
import java.util.List;

public class Calculandoquadrado {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> quadrados = numeros.stream()
                .map(numero -> numero * numero) // Calcula o quadrado de cada número
                .toList();
        System.out.println("Quadrados: " + quadrados);
    }
}
