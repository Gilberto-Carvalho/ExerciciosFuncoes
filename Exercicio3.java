import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double a,s,d;
        Scanner key = new Scanner(System.in);
        System.out.print("Digite o primeiro argumento: ");
        a=key.nextDouble();
        System.out.print("Digite o segundo argumento: ");
        s=key.nextDouble();
        System.out.print("Digite o terceiro argumento: ");
        d=key.nextDouble();
        key.close();
        a=a+s+d;
        System.out.print("A soma dos argumentos é: " + a);
    }
}
