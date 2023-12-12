package listafaccat;

import java.util.Scanner;

public class Exe40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e a média dos" +
                "exercícios que fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula abaixo" +
                "e escrever o conceito do aluno de acordo com a tabela de conceitos mais abaixo:" +
                "N1 + N2 * 2 + N3 * 3 + Média_dos_Exercícios" +
                "Média_de_Aproveitamento = ---------------------------------------------------------" +
                "7" +
                "A atribuição de conceitos obedece a tabela abaixo:" +
                "Média de Aproveitamento Conceito" +
                "> = 9,0 A" +
                "> = 7,5 e < 9,0 B" +
                "> = 6,0 e < 7,5 C" +
                "< 6,0 D");

        System.out.println("Digite o valor da  1° nota: ");
        double nota01 = sc.nextDouble();
        System.out.println("Digite o valor da  2° nota: ");
        double nota02 = sc.nextDouble();
        System.out.println("Digite o valor da  3° nota: ");
        double nota03 = sc.nextDouble();

        double mediaExercicios = (nota01 + nota02 + nota03) / 3;

        double mediaAproveitamento = (nota01 + nota02 * 2 + nota03 * 3 + mediaExercicios) / 7;

        if (mediaAproveitamento >= 9) {
            System.out.println("Sua nota é A " + mediaAproveitamento);
        } else if (mediaAproveitamento >= 7.5) {
            System.out.println("Sua nota é B " + mediaAproveitamento);
        } else if (mediaAproveitamento >= 6) {
            System.out.println("Sua nota é C " + mediaAproveitamento);
        } else {
            System.out.println("Sua nota é D " + mediaAproveitamento);
        }
    }
}
