package listafaccat;

import java.util.Scanner;

public class Exe34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja o seguinte algoritmo:\n" +
                "início\n" +
                "ler x\n" +
                "ler y\n" +
                "z \u0001 (x*y) + 5\n" +
                "se z <= 0 então\n" +
                "resposta \u0001 ‘A’\n" +
                "senão\n" +
                "se z <= 100 então\n" +
                "resposta \u0001 ‘B’\n" +
                "senão\n" +
                "resposta \u0001 ‘C’\n" +
                "fim_se\n" +
                "fim_se\n" +
                "escrever z, resposta\n" +
                "fim\n" +
                "Faça um teste de mesa e complete o quadro a seguir para os seguintes valores");
        System.out.println("Digite o valor de X: ");
        int x = sc.nextInt();

        System.out.println("Digite o valor de Y: ");
        int y = sc.nextInt();

        int z = (x * y) + 5;
        char resposta;

        if (z <= 0) {
            resposta = 'A';
        } else if (z <= 100) {
            resposta = 'B';
        } else {
            resposta = 'C';
        }
        System.out.println("Variáveis\tX\tY\tZ\tResposta");
        System.out.println("\t\t" + x + "\t" + y + "\t" + z + "\t" + resposta);
    }
}
