package listafaccat;

import java.util.Scanner;

public class Exe36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere que as idades\n" +
                "dos homens serão sempre diferentes entre si, bem como as das mulheres). Calcule e escreva a soma\n" +
                "das idades do homem mais velho com a mulher mais nova, e o produto das idades do homem mais\n" +
                "novo com a mulher mais velha.");

        System.out.println("Informe a idade do primeiro homem: ");
        int idadeHomem1 = sc.nextInt();
        System.out.println("Informe a idade do segundo homem: ");
        int idadeHomem2 = sc.nextInt();
        System.out.println("Informe a idade da primeira mulher: ");
        int idadeMulher1 = sc.nextInt();
        System.out.println("Informe a idade da segunda mulher: ");
        int idadeMulher2 = sc.nextInt();

        int homemMaisVelho = Math.max(idadeHomem1, idadeHomem2);
        int homemMaisNovo = Math.min(idadeHomem1, idadeHomem2);
        int mulherMaisVelha = Math.max(idadeMulher1, idadeMulher2);
        int mulherMaisNova = Math.min(idadeMulher1, idadeMulher2);

        int somaIdades = homemMaisVelho + mulherMaisNova;
        int produtoIdades = homemMaisNovo + mulherMaisVelha;

        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + somaIdades);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produtoIdades);
    }
    }
