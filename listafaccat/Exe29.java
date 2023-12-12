package listafaccat;

import java.util.Scanner;

public class Exe29 {
    public static double somaDosDoisMaiores(double a, double b, double c) {
        double maior1 = Math.max(Math.max(a, b), c);


        double[] listaSemMaior = {a, b, c};
        double maior2 = -1;

        for (double valor : listaSemMaior) {
            if (valor != maior1) {
                maior2 = Math.max(maior2, valor);
            }
        }


        double soma = maior1 + maior2;
        return soma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite três valores (considere que não serão informados valores iguais):");
        double valor1 = sc.nextDouble();
        double valor2 = sc.nextDouble();
        double valor3 = sc.nextDouble();


        double resultado = somaDosDoisMaiores(valor1, valor2, valor3);
        System.out.println("A soma dos dois maiores valores é: " + resultado);
}}
