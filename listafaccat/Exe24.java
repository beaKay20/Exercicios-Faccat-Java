package listafaccat;

import java.util.Scanner;

public class Exe24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que\n" +
                "ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que\n" +
                "ultrapassar este valor, calcular e escrever o seu salário total.");

        System.out.println("Digite o valor fixo do seu salário: ");
        double salarioFixo = sc.nextDouble();
        System.out.println("Digite o valor total de vendas efetuadas: ");
        double valorVendas = sc.nextDouble();

        double comissao;

        if (valorVendas <= 1500){
            comissao = 0.03 * valorVendas;
        }else{
            comissao = 0.03 * 1500 + 0.05 * (valorVendas - 1500);
        }
        double salarioTotal = salarioFixo + comissao;
        System.out.println("Seu salário mais o valor de comissão é de R$" + salarioTotal);
        sc.close();
    }
}
