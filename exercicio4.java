package JAVA;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Média entre os números");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os números");

        int escolha = scanner.nextInt();

        double diferenca = 0; 

        switch (escolha) {
            case 1:
                double media = (num1 + num2) / 2;
                System.out.println("Média: " + media);
                break;
            case 2:
                if (num1 > num2) {
                    diferenca = num1 - num2;
                } else {
                    diferenca = num2 - num1;
                }
                System.out.println("Diferença: " + diferenca);
                break;
            case 3:
                double produto = num1 * num2;
                System.out.println("Produto: " + produto);
                break;
            default:
                System.out.println("Opção inválida");
        }

        scanner.close();
    }
}
        