package listafaccat;

import java.util.Scanner;

public class Exe49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ler 10 valores e escrever quantos desses valores lidos são NEGATIVOS.");

        int contNegativos = 0;


        for (int i = 1; i <= 10; i++) {
            System.out.println("Informe o " + i + "º valor: ");
            int valor = sc.nextInt();


            if (valor < 0) {
                contNegativos++;
            }
        }


        System.out.println("Quantidade de valores NEGATIVOS: " + contNegativos);

        sc.close();
    }
}
