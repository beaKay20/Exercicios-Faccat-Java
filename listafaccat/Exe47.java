package listafaccat;

public class Exe47 {
    public static void main(String[] args) {
        System.out.println("Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros entre 15\n" +
                "(inclusive) e 100 (inclusive).");

        int soma = 0;
        int quantidade = 0;

        for (int i = 15; i <= 100; i++) {
            soma += i;
            quantidade++;
        }
        double media = (double) soma / quantidade;


        System.out.println("Média aritmética dos números entre 15 e 100: " + media);
    }
}
