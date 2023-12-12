package listafaccat;

import java.util.Scanner;

public class Exe28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.");

        System.out.println("Digite um valor inteiro: ");
        int valor = sc.nextInt();
        System.out.println("Digite um segundo valor inteiro: ");
        int valor2 = sc.nextInt();
        System.out.println("Digite um terceiro valor inteiro: ");
        int valor3 = sc.nextInt();

        int maiorValor = (valor > valor2) ? (valor > valor3 ? valor : valor3) : (valor2 > valor3 ? valor2 : valor3);
        System.out.println("O maior valor é: " + maiorValor);
    }
}
