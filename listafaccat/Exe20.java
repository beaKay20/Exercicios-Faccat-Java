package listafaccat;

import java.util.Scanner;

public class Exe20 {
    public static void main(String[] args) {
        System.out.println("Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = sc.nextInt();
        System.out.println("Digite um outro valor inteiro: ");
        int valor2 = sc.nextInt();

        if (valor > valor2){
            System.out.println(valor2 + "," + valor);
        }else {
            System.out.println("Valores em ordem cresevente: "+valor + "," + valor2);
    }
}}
