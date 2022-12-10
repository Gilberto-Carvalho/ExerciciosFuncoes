import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        String a;
        System.out.print("Digite um numero inteiro: ");
        Scanner key = new Scanner(System.in);
        a=key.next();
        if(a.matches("^[0-9]*$")){
            System.out.print(a.length());
        } else if(a.matches("^[0-9]*[.]?[0-9]*$")){
            System.out.print("Este não é um numero inteiro.");
        } else {
            System.out.print("Este não é um numero.");
        }
    }
}
