/*13. Faça um programa que dados 2 vetores inteiros de tamanhos 10 e 5, respectivamente,
 calcule e mostre 2 vetores resultantes:
 • no primeiro vetor resultante, cada elemento será composto pela soma de cada
 número par do primeiro vetor somado a todos os números do segundo vetor;
 • o segundo vetor resultante será composto pela quantidade de divisores que cada
 número ímpar do primeiro vetor tem no segundo vetor. */

import java.util.Scanner;

public class pergunta13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[5];

        int i = 0;

        while (i < 10) {
            System.out.print("Digite A[" + (i + 1) + "]: ");
            A[i] = sc.nextInt();
            i++;
        }

        i = 0;

        do {
            System.out.print("Digite B[" + (i + 1) + "]: ");
            B[i] = sc.nextInt();
            i++;
        } while (i < 5);

        String r1 = "\n--- Resultado 1 (pares de A somados com B) ---\n";
        String r2 = "\n--- Resultado 2 (quantidade de divisores de ímpares de A em B) ---\n";

        i = 0;

        while (i < A.length) {
            if (A[i] % 2 == 0) {
                int j = 0;
                while (j < B.length) {
                    r1 += A[i] + " + " + B[j] + " = " + (A[i] + B[j]) + "\n";
                    j++;
                }
            }
            i++;
        }

        for (int k = 0; k < A.length; k++) {
            if (A[k] % 2 != 0) {
                int divisores = 0;

                for (int x : B) {
                    divisores += (A[k] % x == 0 ? 1 : 0);
                }
                r2 += A[k] + " tem " + divisores + " divisores em B\n";
            }
        }

        System.out.println(r1 + r2);
        sc.close();
    }
}