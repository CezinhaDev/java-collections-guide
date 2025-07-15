package br.com.alura;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EstoquedeProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> estoque = new HashMap<>();

        System.out.println("Digite os produtos e suas quantidades (digite 'fim' para encerrar):");

        while( true ){
            System.out.println("Produto:");
            String produto = scanner.nextLine();

            if(produto.equalsIgnoreCase("fim")) { // Se o usuário digitar "fim", encerra o loop
                break;
            }
            System.out.println("Quantidade:");
            int quantidade = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer
            estoque.put(produto, quantidade);
        }

        System.out.println("Estoque:");
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            System.out.println("Produto: " + entry.getKey() + ", Quantidade: " + entry.getValue());
        }
    }
}
