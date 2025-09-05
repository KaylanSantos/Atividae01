/* 8. Faça uma calculadora de troco, baseado nas cédulas da nossa moeda. */

import java.util.Scanner;

public class pergunta8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto vc deve ?");
        double div = sc.nextDouble();
        System.out.println("Qual o valor do pagamentoo ?");
        double pag = sc.nextDouble();

        double trc = pag - div;

        if (trc < 0) {
            System.out.println("Valor insuficiente");
        } else if (trc >= 1) {
            System.out.println("Seu troco e: R$ " + trc);
        } else {
            System.out.println("Seu troco e: " + trc + "centavos");
        }
        sc.close();

    }

}
