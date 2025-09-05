/* 7. Faça um programa que leia dois números e apresente o fatorial de todos os números
 que estejam dentro do intervalo definido pelos números que foram lidos*/

import java.util.Scanner;

public class pergunta7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1 número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o 2 número: ");
        int n2 = sc.nextInt();

        int menor = (n1 < n2) ? n1 : n2;
        int maior = (n1 > n2) ? n1 : n2;

        for (int i = menor; i <= maior; i++) {

            String cal = i + "! = ";
            long fat = 1;

            for (int j = i; j > 0; j--) {
                fat *= j;

                cal += j;
                if (j > 1)
                    cal += " x ";
            }
            System.out.println(cal + " = " + fat);
        }
        sc.close();
    }
}
