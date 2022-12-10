import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        String s;
        char[] l;
        int c, i=0;
        System.out.print("Digite um numero inteiro: ");
        Scanner sc = new Scanner(System.in);
        s=sc.next();
        sc.close();
        if (s.matches("^[0-9]*$")){
            c=s.length();
            l=s.toCharArray();
            while (i<c){
                System.out.print(l[((c-1)-(i))]);
                i=i+1;
            }
        } else if (s.matches("^[0-9]*[.]?[0-9]*$")) {
            System.out.println(s+" não é um numero inteiro.");
        } else {
            System.out.print(s+" não é um numero.");
        }
    }
}
