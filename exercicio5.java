package JAVA;
//exercicio 5
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0);

        double pesoIdeal;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Peso ideal para homens: " + pesoIdeal + " kg");
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Peso ideal para mulheres: " + pesoIdeal + " kg");
        } else {
            System.out.println("Sexo inválido");
        }

        scanner.close();
    }
}