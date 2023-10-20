package JAVA;
import java.util.Scanner;
public class vetor5 {
    public static void main(String[] args) {
        int vetor[]= new int [5];
        int i=0;
        try (Scanner scanner = new Scanner(System.in)) {
            for (int numeros: vetor){
            System.out.println("Digite o valor da posicao " + i + " do vetor: ");
            numeros = scanner.nextInt();
            vetor[i]= numeros;
            i++;
            }
        }
        int inverso[]= new int [5];
        int r=vetor.length - 1;
        for (i=0 ;i< vetor.length ; i++){
            int numero = vetor[r];
            inverso[i]= numero;
            r=r-1;
            System.out.print("\t" + inverso[i] ); 
        }
    }
}