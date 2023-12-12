package listafaccat;
import java.util.Arrays;
import java.util.Scanner;
public class Exe46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o " + (i + 1) + "º número: ");
            vetor[i] = sc.nextInt();
        }

        Arrays.sort(vetor);

        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        sc.close();
    }
}
