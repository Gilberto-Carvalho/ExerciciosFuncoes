import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        String data, dia, mes, ano, mesex;
        int d=0, m=0, a=0, c=0;
        Scanner sc = new Scanner(System.in);
        while (c==0) {
            System.out.print("Digite uma dada no formato 'DD/MM/AAAA': ");
            data = sc.next();
            if (data.matches("^[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}$")) {
                String[] tx = data.split("/");
                dia = tx[0];
                mes = tx[1];
                ano = tx[2];
                d = Integer.parseInt(dia);
                m = Integer.parseInt(mes);
                a = Integer.parseInt(ano);
                if (d < 0 || m < 0 || a < 0 || d > 31 || m > 12) {
                    System.out.println("Data inválida.");
                } else {
                    if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                        c = 1;
                    } else if ((m == 4 || m == 6 || m == 9 || m == 11) && d < 31) {
                        c = 1;
                    } else if (((m == 2 && d < 29) || (((m == 2) && d < 30) && (((a % 4) == 0 && (a % 100) != 0) || (a % 400) == 0)))) {
                        c = 1;
                    } else {
                        System.out.println("Data inválida.");
                    }
                }
            } else {
                System.out.println("Data inválida.");
            }
        }
        sc.close();
        if(m==1){
            mesex="janeiro";
        } else if (m==2) {
            mesex="fevereiro";
        } else if (m==3) {
            mesex="março";
        } else if (m==4) {
            mesex = "abril";
        } else if (m==5) {
            mesex = "maio";
        } else if (m==6) {
            mesex = "junho";
        } else if (m==7) {
            mesex = "julho";
        } else if (m==8) {
            mesex = "agosto";
        } else if (m==9) {
            mesex = "setembro";
        } else if (m==10) {
            mesex = "outubro";
        } else if (m==11) {
            mesex = "novembro";
        } else {
            mesex = "dezembro";
        }
        System.out.print(d + " de " + mesex + " de " + a);
    }
}
