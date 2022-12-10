import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double a;
        System.out.print("Digite um numero: ");
        Scanner key = new Scanner(System.in);
        a=key.nextDouble();
        key.close();
        if (a>0) {
            System.out.print("P");
        } else {
            System.out.print("N");
        }
    }
}
