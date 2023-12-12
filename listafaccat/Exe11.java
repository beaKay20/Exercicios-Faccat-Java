package listafaccat;

import java.util.Scanner;

public class Exe11 {
    public static void main(String[] args) {
        System.out.println("Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,\n" +
                "mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele\n" +
                "efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas\n" +
                "vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do\n" +
                "vendedor.");

        Scanner li = new Scanner(System.in);

        System.out.println("Informe o número total de carros vendidos: ");
        int quantidade_vendida = li.nextInt();
        System.out.println("Informe o valor  total de de suas vendas: ");
        int valor_vendas = li.nextInt();
        System.out.println("Informe o valor de seu salário fixo: ");
        int valor_salario = li.nextInt();
        System.out.println("Informe o valor que recebe por carro vendido: ");
        int totalVendas = li.nextInt();

        double salario_final = valor_salario  + valor_vendas * quantidade_vendida + totalVendas * 0.05;

        System.out.println("O valor do seu salário final é de R$"+salario_final);

    }

}
