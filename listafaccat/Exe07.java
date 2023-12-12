package listafaccat;

import java.util.Scanner;

public class Exe07 {
    public static void main(String[] args) {
        System.out.println("Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade\n" +
                "dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade em anos: ");
        int anos = sc.nextInt();
        System.out.println("Informe sua idade em  meses: ");
        int meses = sc.nextInt();
        System.out.println("Informe sua idade em dias: ");
        int dias = sc.nextInt();


        int idade_dias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade dessa pessoa em dias é igual a: "+idade_dias);

    }
}
