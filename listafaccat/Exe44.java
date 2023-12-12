package listafaccat;

import java.util.Scanner;

public class Exe44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Escreva um algoritmo que imprima a tabuada (de 1 a 10) para os números de 1 a 10.");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            System.out.println();
        }
    }
}