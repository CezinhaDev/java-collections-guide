package br.com.alura;

import java.util.List;

public class Selecionandofuncionários {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        // Selecionando funcionários com menos de 5 letras
        List<String> selecionados = funcionarios.stream()
                .filter(funcionario -> funcionario.length() < 5) // Filtra funcionários com menos de 5 letras
                .toList(); // Coleta os resultados em uma nova lista

                System.out.println("Funcionários com menos de 5 letras: " + selecionados);
    }
}
