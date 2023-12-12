package listafaccat;

import java.util.Scanner;

public class Exe14 {
    public static void main(String[] args) {
        System.out.println("Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso\n" +
                "contrário escrever NÃO É MAIOR QUE 10!");

        Scanner vl = new Scanner(System.in);

        System.out.println("Informe uma valor, por favor: ");
        int valor = vl.nextInt();

        if (valor > 10){
            System.out.println("O valor informado é maior que 10 !");
        }else {
            System.out.println("O valor informado é menor que 10!");
        }
    }
}
