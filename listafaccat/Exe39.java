package listafaccat;

import java.util.Scanner;

public class Exe39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e o preço\n" +
                "unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total\n" +
                "a pagar (total a pagar = total - desconto), sabendo-se que:\n" +
                "- Se quantidade <= 5 o desconto será de 2%\n" +
                "- Se quantidade > 5 e quantidade <=10 o desconto será de 3%\n" +
                "- Se quantidade > 10 o desconto será de 5%");


        System.out.println("______________________ |");
        System.out.println("TABELA DE PRODUTOS     |");
        System.out.println("---------------------- |");
        System.out.println("1- RS2,00 Maça         |");
        System.out.println("---------------------- |");
        System.out.println("2- RS6,00 Morango      |");
        System.out.println("---------------------- |");
        System.out.println("3- RS3,00 Limão        |");
        System.out.println("_______________________|");

        System.out.println("Informe o número que corresponde ao  produto que deseja, de acordo com a tabela: ");
        int produto = sc.nextInt();
        System.out.println("Informe o quantidade do produto que deseja comprar: ");
        int quantidade = sc.nextInt();


        double preco = 0.0;


        switch (produto) {
            case 1:
                preco = 2.0;
                break;
            case 2:
                preco = 6.0;
                break;
            case 3:
                preco = 3.0;
                break;
            default:
                System.out.println("Produto inválido!");
                return;
        }

        double valorTotal = quantidade * preco;
        double desconto = 0.0;

        if (quantidade <= 5) {
            desconto = valorTotal * 0.02;
        } else if (quantidade > 5 && quantidade <= 10) {
            desconto = valorTotal * 0.03;
        } else {
            desconto = valorTotal * 0.05;
        }

        double totalAPagar = valorTotal - desconto;

        System.out.println("Total a pagar: R$" + totalAPagar);

        sc.close();

    }
}
