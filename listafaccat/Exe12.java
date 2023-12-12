package listafaccat;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {
        System.out.println("Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor\n" +
                "correspondente em graus Celsius (baseado na fórmula abaixo):\n" +
                "C F - 32\n" +
                "---------- = -----------\n" +
                "5 9");
        Scanner  sc = new Scanner(System.in);

        System.out.println("Informe o valor da temperatura em graus Fahrenheit para converter em graus celsius: ");
        double fahrenheit = sc.nextDouble();


        double graus_celsius = (fahrenheit - 32 ) * 5 / 9;

        System.out.println("O valor corresponde a " +graus_celsius+ "C° graus");




    }
}
