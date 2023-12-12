package listafaccat;

import java.util.Scanner;

public class Exe21 {
    public static void main(String[] args) {
        System.out.println("Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os\n" +
                "minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é\n" +
                "de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte");

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a hora de ínicio do jogo de xadrez: ");
        int hora_inicio = sc.nextInt();

        System.out.println("Informe a hora do fim do jogo de xadrez: ");
        int hora_fim = sc.nextInt();

        int duracao_jogo;
        if (hora_inicio <= hora_fim) {
            duracao_jogo = hora_fim - hora_inicio;
        } else {
            duracao_jogo = 24 - hora_inicio + hora_fim;
        }

        System.out.println("A duração do jogo é de " + duracao_jogo + " horas.");
    }
}
