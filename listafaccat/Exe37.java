package listafaccat;

import java.util.Scanner;

public class Exe37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(") Uma fruteira está vendendo frutas com a seguinte tabela de preços:\n" +
                "Até 5 Kg Acima de 5 Kg\n" +
                "Morango R$ 2,50 por Kg R$ 2,20 por Kg\n" +
                "Maçã R$ 1,80 por Kg R$ 1,50 por Kg\n" +
                "Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá\n" +
                "ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de\n" +
                "morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente");

        System.out.println("Digite a quantidade (em Kg) de morangos:");
        double kgMorango = sc.nextDouble();

        System.out.println("Digite a quantidade (em Kg) de maçãs:");
        double kgMaca = sc.nextDouble();

        double precoMorango = calcularPrecoFruta(kgMorango, 2.50, 2.20);
        double precoMaca = calcularPrecoFruta(kgMaca, 1.80, 1.50);

        double precoTotal = precoMorango + precoMaca;

        if ((kgMorango + kgMaca) > 8 || precoTotal > 25.00) {
            precoTotal *= 0.9; // Aplica o desconto de 10%
        }

        System.out.println("O valor a ser pago pelo cliente é: R$ " + precoTotal);

        sc.close();
    }

    private static double calcularPrecoFruta(double kg, double precoAte5Kg, double precoAcima5Kg) {
        if (kg <= 5) {
            return kg * precoAte5Kg;
        } else {
            return kg * precoAcima5Kg;
        }
    }
}
