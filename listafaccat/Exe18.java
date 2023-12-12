package listafaccat;

import java.util.Scanner;

public class Exe18 {
    public static void main(String[] args) {
        System.out.println("Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela\n" +
                "poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ano atual: ");
        int anoAtual = sc.nextInt();
        System.out.println("Informe o ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        String mensagem = (anoAtual - anoNascimento >= 16) ? "Já pode votar" : "Ainda não pode votar";
        System.out.println(mensagem);
    }
}
