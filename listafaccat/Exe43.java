package listafaccat;

import java.util.Scanner;

public class Exe43 {
    public static void main(String[] args) {
        Scanner be = new Scanner(System.in);

        System.out.println(" Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a" +
                "média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada" +
                "nota.");
        double nota1, nota2;


        do {
            System.out.println("Informe a nota da 1ª avaliação (0 a 10): ");
            nota1 = be.nextDouble();
        } while (nota1 < 0 || nota1 > 10);


        do {
            System.out.println("Informe a nota da 2ª avaliação (0 a 10): ");
            nota2 = be.nextDouble();
        } while (nota2 < 0 || nota2 > 10);


        double media = (nota1 + nota2) / 2;
        System.out.println("Média do aluno: " + media);

        be.close();
    }
}
