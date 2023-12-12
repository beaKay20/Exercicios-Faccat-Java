package listafaccat;

import java.util.Scanner;

public class Exe35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Um posto está vendendo combustíveis com a seguinte tabela de descontos:\n" +
                "até 20 litros, desconto de 3% por litro\n" +
                "Álcool acima de 20 litros, desconto de 5% por litro\n" +
                "até 20 litros, desconto de 4% por litro\n" +
                "Gasolina acima de 20 litros, desconto de 6% por litro\n" +
                "Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da\n" +
                "seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se\n" +
                "que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.");

        System.out.println("Digite o número de litros vendidos: ");
        double litros = sc.nextDouble();

        System.out.println("Digite o tipo de combustível (A - Álcool, G - Gasolina): ");
        char tipoCombustivel = sc.next().charAt(0);

        double precoAlcool = 2.90;
        double precoGasolina = 3.30;
        double desconto = 0.0;
        double valorTotal;

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
            valorTotal = litros * (precoAlcool - (precoAlcool * desconto));
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
            valorTotal = litros * (precoGasolina - (precoGasolina * desconto));
        } else {
            System.out.println("Tipo de combustível inválido. Use 'A' para Álcool ou 'G' para Gasolina.");
            return;
        }

        System.out.println("Valor a ser pago pelo cliente: R$ " + valorTotal);
    }
    }

