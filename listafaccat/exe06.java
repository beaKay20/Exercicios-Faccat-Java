package listafaccat;

import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {
        System.out.println("Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a\n" +
                "área do retângulo.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor da base do retângulo: ");
        int base = sc.nextInt();
        System.out.println("Informe o valor da altura do retângulo: ");
        int altura = sc.nextInt();

        int area = base * altura;

        System.out.println("A área do retângulo é igual: "+area);

        System.out.println();
    }
}
