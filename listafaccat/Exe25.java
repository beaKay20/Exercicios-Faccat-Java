package listafaccat;

import java.util.Scanner;

public class Exe25 {
    public static void main(String[] args) {
        System.out.println(" Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e\n" +
                "escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior\n" +
                "ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo");
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número da conta: ");
        int conta = sc.nextInt();
        System.out.println("Informe o saldo da conta: ");
        double saldo = sc.nextDouble();
        System.out.println("Informe o valor de débito disponível na conta: ");
        double debito = sc.nextDouble();
        System.out.println("Informe o valor de crédito disponível na conta: ");
        double credito = sc.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.println(saldoAtual >= 0 ? "Seu Saldo está Positivo" : "Seu saldo está Negativo");

        sc.close();
    }
}
