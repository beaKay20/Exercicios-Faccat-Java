package listafaccat;

import java.util.Scanner;

public class Exe33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ler dois valores e imprimir uma das três mensagens a seguir:\n" +
                "‘Números iguais’, caso os números sejam iguais\n" +
                "‘Primeiro é maior’, caso o primeiro seja maior que o segundo;\n" +
                "‘Segundo maior’, caso o segundo seja maior que o primeiro.");

        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();


        String mensagem;

        if (valor1 == valor2) {
            mensagem = "Números iguais";
        } else if (valor1 > valor2) {
            mensagem = "Primeiro é maior";
        } else {
            mensagem = "Segundo é maior";
        }

        System.out.println(mensagem);
    }
}
