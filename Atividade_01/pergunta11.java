/*11. Faça um programa que leia um conjunto não determinado de valores, um de cada vez, e
 escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte linhas. A tabela
 deverá conter o valor lido, seu cubo e sua raiz quadrada. Finalize quando a entrada for
 um número negativo ou 0. */

import java.util.Scanner;

public class pergunta11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[20];
        int cont = 0;

        for (;;) {
            System.out.println("Digite um valor (0 ou negativo para parar):");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            numeros[cont] = num;
            cont++;

            if (cont == 20) {
                System.out.println("=== Tabela de 20 valores ===");
                for (int i = 0; i < 20; i++) {
                    double cubo = Math.pow(numeros[i], 3);
                    double raiz = Math.sqrt(numeros[i]);
                    System.out.printf("%-10.2f %-10.2f %-10.2f%n", numeros[i], cubo, raiz);
                }
                cont = 0;
            }
        }

        sc.close();
    }

}
