package listafaccat;

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {
        System.out.println("Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.\n" +
                "Calcular e escrever o valor do novo salário.");
        Scanner ja = new Scanner(System.in);

        System.out.println("Informe o valor mensal atual do seu salário, por favor: ");
        float valor_atual = ja.nextFloat();
        System.out.println("Informe o percentual de reajuste sobre o salário, por favor: ");
        float reajuste = ja.nextFloat();

        float novo_valor = valor_atual + (valor_atual* (reajuste / 100));

        System.out.println(novo_valor);
    }
}
