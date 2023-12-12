package listafaccat;

import java.util.Scanner;

public class Exe50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double soma = 0.0;


        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o " + i + "º valor: ");
            double valor = sc.nextDouble();

            soma += valor;
        }

        double media = soma / 10;
        System.out.println("Média aritmética dos valores lidos: " + media);

        sc.close();
    }
}
