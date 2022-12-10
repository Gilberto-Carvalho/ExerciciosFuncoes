import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
//        Faça um programa que colete 10 numeros inteiros distintos.
        int i=0,j=0, k=0;
        int[] v= new int[10];
        Scanner sc = new Scanner(System.in);
        while (i<10) {
            System.out.println("Digite o "+(i+1)+"º numero: ");
            v[i] = sc.nextInt();
            while (j<10){
                k=0;
                if (v[j] == v[i] && i!=j) {
                    System.out.println("Valor já digitado; digite outro.");
                    j = 10;
                } else {
                    j = j + 1;
                    k = 1;
                }
            }
            j=0;
            if (k==1){
                i=i+1;
            }
        }
        i=0;
        while (i<10){
            System.out.println(v[i]);
            i=i+1;
        }
    }
}
