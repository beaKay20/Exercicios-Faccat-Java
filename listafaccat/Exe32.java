package listafaccat;

import java.util.Scanner;

public class Exe32 {
    public static void main(String[] args) {
            Scanner li = new Scanner(System.in);

            System.out.println("Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE");

            System.out.println("Informe o nome do primeiro time e a quantidade de gols feitos: ");
            String time1Nome = li.next();
            int time1Gols = li.nextInt();

            System.out.println("Informe o nome do segundo time e a quantidade de gols feitos: ");
            String time2Nome = li.next();
            int time2Gols = li.nextInt();

            String mensagem;

            if (time1Gols > time2Gols) {
                mensagem = "O time vencedor é " + time1Nome;
            } else if (time2Gols > time1Gols) {
                mensagem = "O time vencedor é " + time2Nome;
            } else {
                mensagem = "EMPATE";
            }

            System.out.println(mensagem);
    }
}
