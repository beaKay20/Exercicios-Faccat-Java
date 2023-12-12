package listafaccat;
import java.util.Scanner;
public class Exe48 {
    public static void main(String[] args) {
        System.out.println("Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um algoritmo" +
                "que permita a entrada das seguintes informações: a) o número total de mercadorias no estoque; b) o" +
                "valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das" +
                "mercadorias");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número total de mercadorias no estoque: ");
        int numeroTotalMercadorias = sc.nextInt();

        double valorTotal = 0.0;
        double mediaValor = 0.0;


        for (int i = 1; i <= numeroTotalMercadorias; i++) {
            System.out.println("Informe o valor da mercadoria " + i + ": ");
            double valorMercadoria = sc.nextDouble();


            valorTotal += valorMercadoria;
        }

        if (numeroTotalMercadorias > 0) {
            mediaValor = valorTotal / numeroTotalMercadorias;
        }


        System.out.println("Valor total em estoque: " + valorTotal);
        System.out.println("Média de valor das mercadorias: " + mediaValor);

        sc.close();
    }
}
