package listafaccat;

import java.util.Scanner;

public class Exe10 {
    public static void main(String[] args) {
        System.out.println(") O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do\n" +
                "distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor\n" +
                "seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,\n" +
                "calcular e escrever o custo final ao consumidor.");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica do carro: ");


        double custoFabrica = scanner.nextDouble();


        double percentualDistribuidor = 0.28;
        double percentualImpostos = 0.45;


        double custoConsumidor = calcularCustoConsumidor(custoFabrica, percentualDistribuidor, percentualImpostos);


        System.out.println("O custo final ao consumidor é: " + custoConsumidor);


        scanner.close();
    }
    private static double calcularCustoConsumidor(double custoFabrica, double percentualDistribuidor, double percentualImpostos) {
        return custoFabrica + (custoFabrica * percentualDistribuidor) + (custoFabrica * percentualImpostos);
    }
}
