package listafaccat;
import java.util.Scanner;
public class Exe45 {
    public static void main(String[] args) {
        System.out.println("Escreva um algoritmo que permita a leitura das notas de uma turma de 20 alunos. Calcular a média" +
                "da turma e contar quantos alunos obtiveram nota acima desta média calculada. Escrever a média da" +
                "turma e o resultado da contagem.");

        Scanner sc = new Scanner(System.in);

        final int totalAlunos = 20;


        double somaNotas = 0;
        for (int i = 1; i <= totalAlunos; i++) {
            System.out.println("Informe a nota do aluno " + i + ": ");
            double nota = sc.nextDouble();
            somaNotas += nota;
        }

        double mediaTurma = somaNotas / totalAlunos;
        int alunosAcimaMedia = 0;
        for (int i = 1; i <= totalAlunos; i++) {
            System.out.println("Informe a nota do aluno " + i + ": ");
            double nota = sc.nextDouble();
            if (nota > mediaTurma) {
                alunosAcimaMedia++;
            }
        }


        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Alunos com nota acima da média: " + alunosAcimaMedia);

        sc.close();
    }
}
