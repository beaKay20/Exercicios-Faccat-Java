package listafaccat;

import java.util.Scanner;

public class Exe16 {
    public static void main(String[] args) {
        System.out.println("As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem\n" +
                "compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e\n" +
                "escreva o custo total da compra.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de maças compradas: ");
        int quantidade = sc.nextInt();

        if (quantidade >= 12){
            double valor = quantidade * 1.00;
            System.out.println("O valor total da maças compradas é R$"+valor);
        }else{
            double valor = quantidade * 1.30;
            System.out.println("O valor total da maças compradas é R$"+valor);
        }




    }
}
