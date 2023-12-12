package listafaccat;

import java.util.Scanner;

public class Exe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Para o enunciado a seguir foi elaborado um algoritmo em Português Estruturado que contém\n" +
                "erros, identifique os erros no algoritmo apresentado abaixo:\n" +
                "Enunciado: Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa, calcule\n" +
                "e mostre seu peso ideal, utilizando as seguintes fórmulas:\n" +
                "- para sexo masculino: peso ideal = (72.7 * altura) - 58\n" +
                "- para sexo feminino: peso ideal = (62.1 * altura) - 44.7\n" +
                "inicio\n" +
                "ler nome\n" +
                "ler sexo\n" +
                "se sexo = M então\n" +
                "peso_ideal \u0001 (72.7 * altura) - 58\n" +
                "senão\n" +
                "peso_ideal \u0001 (62.1 * altura) – 44.7\n" +
                "fim_se\n" +
                "escrever peso_ideal\n" +
                "fim");

        String nome;
        char sexo;
        double altura;
        double pesoIdeal;


        System.out.print("Informe o nome: ");
        nome = sc.nextLine();

        System.out.print("Informe o sexo (M ou F): ");
        sexo = sc.next().charAt(0);

        System.out.print("Informe a altura em metros: ");
        altura = sc.nextDouble();


        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido. Informe M para masculino ou F para feminino.");
            return;
        }

        System.out.println("O peso ideal para " + nome + " é: " + pesoIdeal + " kg");
        sc.close();
    }
}
