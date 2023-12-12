package listafaccat;

import java.util.Scanner;

public class Exe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(") A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais\n" +
                "de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.\n" +
                "Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva\n" +
                "o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas\n" +
                "(considere que o mês possua 4 semanas exatas)");

            final int JORNADA_SEMANAL = 40;
            final int SEMANAS_NO_MES = 4;
            final double ACRESCIMO_HORAS_EXTRAS = 0.5;


            System.out.print("Informe o número de horas trabalhadas em um mês: ");
            double horasTrabalhadas = sc.nextDouble();
            System.out.print("Informe o salário por hora: ");
            double salarioPorHora = sc.nextDouble();

            double salarioTotal;

            if (horasTrabalhadas <= JORNADA_SEMANAL * SEMANAS_NO_MES) {
                salarioTotal = horasTrabalhadas * salarioPorHora;
            } else {
                double horasNormais = JORNADA_SEMANAL * SEMANAS_NO_MES;
                double horasExtras = horasTrabalhadas - horasNormais;
                salarioTotal = horasNormais * salarioPorHora + horasExtras * (salarioPorHora * (1 + ACRESCIMO_HORAS_EXTRAS));
            }

            System.out.println("O salário total do funcionário é: " + salarioTotal);

            sc.close();
    }
}
