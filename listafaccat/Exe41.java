package listafaccat;

import java.util.Scanner;

public class Exe41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. Para" +
                "estar em condições, um dos seguintes requisitos deve ser satisfeito:" +
                "- Ter no mínimo 65 anos de idade." +
                "- Ter trabalhado no mínimo 30 anos." +
                "- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos." +
                "Com base nas informações acima, faça um algoritmo que leia: o número do empregado (código), o ano" +
                "de seu nascimento e o ano de seu ingresso na empresa. O programa deverá escrever a idade e o tempo" +
                "de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.");


        System.out.println("Informe seu código de trabalho: ");
        int cod = sc.nextInt();
        System.out.println("Informe sua idade, por favor: ");
        int idade = sc.nextInt();
        System.out.println("Informe o ano em que ingressou na empresa,  por favor: ");
        int anoIngressou = sc.nextInt();

        int tempoTrabalho = 2023 - anoIngressou;

        if (idade >= 65 ){
            System.out.println("Funcionário referente ao cod" +cod+ "Requerer aposentadoria");
        }else if(tempoTrabalho >= 30){
            System.out.println("Requerer aposentadoria");
        }else if (idade >= 60 && tempoTrabalho >= 25){
            System.out.println("Requerer aposentadoria ");
        }else{
            System.out.println("Não requerer");
        }
    }
}
