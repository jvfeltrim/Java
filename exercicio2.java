package JAVA;
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da prestação: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite a taxa de juros (%): ");
        double taxa = scanner.nextDouble();
        System.out.print("Informe o tempo em meses: ");
        int tempo = scanner.nextInt();
        double prestacao = valor + (valor * (taxa / 100) * tempo);
        System.out.println("O valor da prestação em atraso é: " + prestacao);
        scanner.close();
    }
}