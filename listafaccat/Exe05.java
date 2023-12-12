package listafaccat;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {
        System.out.println("Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor : ");
        int valor = sc.nextInt();

       int antecessor = valor - 1;
        System.out.println("O antecesssor do valor " +valor+ " é : "+antecessor);
    }
}
