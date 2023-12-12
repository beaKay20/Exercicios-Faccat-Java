package listafaccat;

import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        System.out.println(") Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos\n" +
                "brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total\n" +
                "de eleitores");

        Scanner ja = new Scanner(System.in);

        System.out.println("Informe o númeor total de eleitores do município: ");
        int eleitores = ja.nextInt();
        System.out.println("Informe o númeor total de votos brancos do município: ");
        int votos_brancos= ja.nextInt();
        System.out.println("Informe o númeor total de votos nulos do município: ");
        int votos_nulos = ja.nextInt();
        System.out.println("Informe o númeor total de votos válidos do município: ");
        int votos_validos= ja.nextInt();

        int perceVotos_brancos = votos_brancos * eleitores / 100;
        int perceVotos_nulos = votos_nulos * eleitores / 100;
        int perceVotos_validos= votos_validos * eleitores / 100;


        System.out.println("O total de eleitores no município é de: " +eleitores);
        System.out.println("A porcentagem de votos brancos corresponde a: " +perceVotos_brancos+ "%");
        System.out.println("A porcentagem de votos nulos corresponde a: " +perceVotos_nulos+ "%");
        System.out.println("A porcentagem de votos válidos corresponde a: " +perceVotos_validos+ "%");

    }
}
