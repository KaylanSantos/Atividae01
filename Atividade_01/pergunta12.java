/*12. Faça umprograma que, dados 2 vetores com 10 números inteiros cada, gere e imprima
 um vetor dos números não comuns aos vetores */

import java.util.Scanner;

public class pergunta12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] naoComuns = new int[20];
        int k = 0;

        System.out.println("Digite 10 números para o primeiro vetor:");

        for (int i = 0; i < 10; i++) {
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Digite 10 números para o segundo vetor:");

        for (int i = 0; i < 10; i++) {
            vetor2[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean existe = false;

            for (int j = 0; j < 10; j++) {
                if (vetor1[i] == vetor2[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                naoComuns[k++] = vetor1[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            boolean existe = false;

            for (int j = 0; j < 10; j++) {
                if (vetor2[i] == vetor1[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                naoComuns[k++] = vetor2[i];
            }
        }

        System.out.println("\nNúmeros não comuns entre os vetores:");

        for (int i = 0; i < k; i++) {
            System.out.print(naoComuns[i] + " ");
        }
        sc.close();
    }
}
