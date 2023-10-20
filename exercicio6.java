package JAVA;
//exercicio 6
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 10;
        int somaIdades = 0;
        int pessoasMaior18 = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;

            if (idade >= 18) {
                pessoasMaior18++;
            }
        }

        double mediaIdade = (double) somaIdades / totalPessoas;

        System.out.println("Quantidade de pessoas com idade maior ou igual a 18 anos: " + pessoasMaior18);
        System.out.println("Média de idade do grupo: " + mediaIdade);

        scanner.close();
    }
}