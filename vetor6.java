package JAVA;
public class vetor6 {
    public static void main(String[] args) {
    double [] v1= {1.2,3.4,6.4};
    double v2 []= {1.2,3.12,5.32};
    double somav1= v1[0]+v1[1]+v1[2];
    double somav2= v2[0]+v2[1]+v2[2];
    int i=0;
    if (somav1> somav2){
        for (i=0;i<3;i++){
            System.out.print("\t" + v1[i]);
        }
        for(i=0;i<3;i++){
            System.out.print("\t" + v2[i]);
    }
}
    else{
        for (i=0;i<3;i++){
            System.out.print("\t" + v2[i]);
        }
        for(i=0;i<3;i++){
            System.out.print("\t" + v1[i]);
    }
}
}
}