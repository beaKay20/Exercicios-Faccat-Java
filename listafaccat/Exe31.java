package listafaccat;

import java.util.Scanner;

public class Exe31 {
    public static void main(String[] args) {
        Scanner li = new Scanner(System.in);
        System.out.println("Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se formam\n" +
                "ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma\n" +
                "dos outros 2 lados");

        System.out.println("Digite os valores dos lados A, B e C do triângulo:");
        double a = li.nextDouble();
        double b = li.nextDouble();
        double c =  li.nextDouble();

        if (formaTriangulo(a, b, c)) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores NÃO formam um triângulo.");
        }
    }

    public static boolean formaTriangulo(double a, double b, double c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }
}
