package listafaccat;

import java.util.Scanner;

public class Exe38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Faça um algoritmo para ler um número que é um código de usuário. Caso este código seja\n" +
                "diferente de um código armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a\n" +
                "mensagem ‘Usuário inválido!’. Caso o Código seja correto, deve ser lido outro valor que é a senha. Se\n" +
                "esta senha estiver incorreta (a certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a\n" +
                "senha esteja correta, deve ser mostrada a mensagem ‘Acesso permitido’.");

        System.out.println("Informe o código de usuário: ");
        int codigo = sc.nextInt();

        if (codigo != 1234) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.println("Informe a senha: ");
            int senha = sc.nextInt();

            if (senha == 9999) {
                System.out.println("Acesso permitido");
            } else {
                System.out.println("Senha informada está incorreta! ");
            }
        }}
    }

