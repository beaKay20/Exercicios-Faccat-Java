package listafaccat;

import java.util.Scanner;

public class Exe17 {
    public static void main(String[] args) {
        System.out.println("Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever\n" +
                "uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o\n" +
                "aluno é aprovado). Escrever também a média calculada.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a nota da primeira avaliação: ");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a nota da segunda avaliação: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6){
            System.out.println("Aluno aprovado, sua média foi de "+media);
        }else{
            System.out.println("Aluno reprovado, sua média foi de "+media);
        }
    }
}
