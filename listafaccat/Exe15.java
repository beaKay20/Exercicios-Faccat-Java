package listafaccat;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        System.out.println("Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo)");

        Scanner vl = new Scanner(System.in);

        System.out.println("Informe um valor qualquer, por favor: ");
        float valor = vl.nextFloat();

        if (valor >= 0){
            System.out.println("O valor informado é positivo!");
        }else{
            System.out.println("O valor informado é negativo!");
        }
    }
}
