package listafaccat;

import java.util.Scanner;

public class Exe27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ler um valor e escrever se é positivo, negativo ou zero");

        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();

        String mensagem = (valor > 0) ? "Valor é Positivo" : (valor < 0) ? "Valor é Negativo" : "O valor é zero";
        System.out.println(mensagem);
    }
}
