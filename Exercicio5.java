import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double somaImposto, taxaImposto, custo;
        DecimalFormat df = new DecimalFormat("R$###,###,###,###,###.00");
        System.out.print("Qual a taxa do imposto em percentual? ");
        Scanner key = new Scanner(System.in);
        taxaImposto= key.nextDouble();
        taxaImposto=taxaImposto/100;
        System.out.print("Qual o valor do produto sem impostos? ");
        custo= key.nextDouble();
        key.close();
        somaImposto=custo*taxaImposto;
        System.out.print("O custo do produto com os impostos será de: " + df.format(somaImposto));
    }
}
