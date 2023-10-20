 package JAVA;

    public class vetor8 {
        public static void main(String[] args) {
        int vetor[]= {1,2,3,4,5,6,7,8,9};
        int i=0;
        int r= 8;
        int vetor2[]= new int [9];
        for(i=0;i< vetor.length; i++){
            vetor2[i]=vetor[r];
            r=r-1;
        }
        for (i=0;i< vetor.length; i++){
            vetor[i]=vetor2[i];
            System.out.print(vetor[i] + "\t");
        }
        }
        
    }
    

