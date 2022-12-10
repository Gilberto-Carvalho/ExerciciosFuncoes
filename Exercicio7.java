import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        double valorPrestação, valorPagamento, total=0;
        int diasAtraso, c=0;
        DecimalFormat df = new DecimalFormat("R$###,###,###,###,###,##0.00");
        System.out.print("Digite o valor da prestação: ");
        Scanner key = new Scanner(System.in);
        valorPrestação=key.nextDouble();
        while (valorPrestação!=0){
            if (valorPrestação>0){
                System.out.print("Digite a quantidade de dias de atraso: ");
                diasAtraso=key.nextInt();
                if (diasAtraso>=0){
                    if (diasAtraso==0){
                        valorPagamento=valorPrestação;
                    } else {
                        valorPagamento=(valorPrestação*1.03*(1+(diasAtraso*0.001)));
                    }
                    total=total+valorPagamento;
                    c=c+1;
                    System.out.println("O valor a ser pago será: "+df.format(valorPagamento));
                } else {
                    System.out.println("Dias de atraso não pode ser negativo");
                }
            } else {
                System.out.println("Valor da prestação não pode ser negativo");
            }
            System.out.print("Digite o valor da prestação: ");
            valorPrestação=key.nextDouble();
        }
        key.close();
        System.out.print("Foi pago um total de "+c+" prestações totalizando: "+df.format(total));
    }
}
