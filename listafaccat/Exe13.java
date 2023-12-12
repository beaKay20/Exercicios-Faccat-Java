package listafaccat;

import java.util.Scanner;

public class Exe13 {
    public static void main(String[] args) {
        System.out.println("Faça um algoritmo que leia três notas de um aluno, calcule e escreva a média final deste aluno.\n" +
                "Considerar que a média é ponderada e que o peso das notas é 2, 3 e 5. Fórmula para o cálculo da média\n" +
                "final é:\n" +
                "n1 * 2 + n2 * 3 + n3 * 5\n" +
                "mediafinal = -----------------------------------\n" +
                "10");

        Scanner nt = new Scanner(System.in);

        System.out.println("Informe o valor da sua primeira nota: ");
        double nota1 = nt.nextDouble();
        System.out.println("Informe o valor da sua segunda nota: ");
        double nota2 = nt.nextDouble();
        System.out.println("Informe o valor da sua terceira nota: ");
        double nota3 = nt.nextDouble();

        double media_final = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;

        System.out.println("O valor da nota final, corresponde a " + media_final);
    }
}
