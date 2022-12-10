import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        String l="s";
        int h, m, i=0;
        DecimalFormat df = new DecimalFormat("00");
        Scanner key = new Scanner(System.in);
        while (i!=1) {
            System.out.print("Você deseja converter um horario da notação de 24h para a notação de 12h? (Digite 's' para sim e 'n' para não).\n");
            l = key.next();
            if ((l.equalsIgnoreCase("s"))||(l.equalsIgnoreCase("n"))){
                i=1;
            }else {
                System.out.println("Digito inválido.");
                i=0;
            }
        }
        while (l.equalsIgnoreCase("s")) {
            i=0;
            System.out.print("Digite a hora: ");
            h = key.nextInt();
            if ((h < 0) || (h > 23)) {
                System.out.println("Valor incorreto para hora.");
            } else {
                System.out.print("Digite os munutos: ");
                m = key.nextInt();
                if ((m < 0) || (m > 59)) {
                    System.out.println("Valor incorreto para os minutos.");
                } else {
                    if (h>12){
                        h=h-12;
                        System.out.println("São: "+df.format(h)+":"+df.format(m)+" P.M.");
                    } else {
                        System.out.println("São: "+df.format(h)+":"+df.format(m)+" A.M.");
                    }
                    while (i!=1) {
                        System.out.print("Você deseja converter um horario da notação de 24h para a notação de 12h? (Digite 's' para sim e 'n' para não).\n");
                        l = key.next();
                        if ((l.equalsIgnoreCase("s"))||(l.equalsIgnoreCase("n"))){
                            i=1;
                        }else {
                            System.out.println("Digito inválido.");
                            i=0;
                        }
                    }
                }
            }
        }
    }
}
