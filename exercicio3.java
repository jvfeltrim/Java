package JAVA;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;


        System.out.println("Média Aritmética: " + media);
        if (media >= 0.0 && media <= 3.9){
        System.out.println("Reprovado");
        }
        else if (media >= 4.0 && media <= 6.9) {
        System.out.println("Exame");
        }
        else if (media >= 4.0 && media <= 6.9) {
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Media invalida");
        }

        scanner.close();
    }
}

    