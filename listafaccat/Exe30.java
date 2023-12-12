package listafaccat;

import java.util.Arrays;
import java.util.Scanner;

public class Exe30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem\n" +
                "crescente");

            System.out.println("Digite três valores (sem repetição):");
            double[] valores = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};

            Arrays.sort(valores);
            System.out.println("Valores em ordem crescente: " + valores[0] + ", " + valores[1] + ", " + valores[2]);
    }
}
