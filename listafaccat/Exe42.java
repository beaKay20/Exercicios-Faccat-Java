package listafaccat;

import java.util.Scanner;

public class Exe42 {
    public static void main(String[] args) {
        Scanner be = new Scanner(System.in);
        System.out.println("Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido\n" +
                "um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado\n" +
                "da divisão do primeiro valor lido pelo segundo valor lido. (utilizar a estrutura REPITA)");

        double primeiroValor, segundoValor;

        System.out.println("Informe o primeiro valor: ");
        primeiroValor = be.nextDouble();

        do {
            System.out.println("Informe o segundo valor (não pode ser zero): ");
            segundoValor = be.nextDouble();
        } while (segundoValor == 0);

        double resultado = primeiroValor / segundoValor;

        System.out.println("Resultado da divisão: " + resultado);

        be.close();
    }
}
