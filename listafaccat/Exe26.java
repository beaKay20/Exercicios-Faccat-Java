package listafaccat;

import java.util.Scanner;

public class Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(") Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e\n" +
                "quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade\n" +
                "média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual\n" +
                "a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar\n" +
                "compra'");

        System.out.println("Informe a quantidade atual em estoque: ");
        int quantidadeAtual = sc.nextInt();

        System.out.println("Informe a quantidade máxima em estoque: ");
        int quantidadeMaxima = sc.nextInt();

        System.out.println("Informe a quantidade mínima em estoque: ");
        int quantidadeMinima = sc.nextInt();

        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("Não é possível efetuar compra");
        } else {
            System.out.println("É possível efetuar a compra");
        }


        sc.close();
    }
}
