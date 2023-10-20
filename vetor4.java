package JAVA;
    import java.util.Scanner;
    public class vetor4 {
        public static void main(String[] args) {
        double notas[]= new double [100];  
        double nota= 0;
        int tamanhoVet=0;
        int i=0;
        double soma= 0;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a nota do aluno " + i + ": ");
            nota = scanner.nextDouble();
            notas[i]= nota;
            soma= soma + notas[i];
            i++;
            tamanhoVet++;
        } while (nota>-1);
        i=0;
        double media= soma / tamanhoVet;
        int maiorMedia=0;
        System.out.println("Quantidade de valores lidos: " + (tamanhoVet-1));
        System.out.println("Valores na ordem em que foram informados: ");
        for (i=0; i<tamanhoVet - 1; i++){
            double numero = notas[i];
            System.out.println("\t" + numero);
            if (notas[i]>media){
                maiorMedia++;
            }
        }
        int r= tamanhoVet-2;
        System.out.println("Valores na ordem iversa na qual foram informados: ");
        double inverso[]= new double [tamanhoVet];
        for (i=1; i< tamanhoVet ; i++){
            double numeros = notas[r];
            inverso[i]= numeros;
            r=r-1;
            System.out.println("\t" + numeros); 
            }
        
        System.out.println("Soma dos valores informados: " + soma);
        System.out.println("A media dos valores informados e: " + media);
        System.out.println("Quantidade de valores maiores que a media e: " + maiorMedia);
        }
    }

