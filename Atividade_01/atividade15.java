/*15. Façaumprogramaquepreenchaumamatriz7x7denúmerosinteirosecriedoisvetores
 com sete posições cada um que contenham, respectivamente, o maior elemento de
 cada uma das linhas e o menor elemento de cada uma das colunas. Escreva a matriz
 e os dois vetores gerados. */

import java.util.Random;

public class atividade15 {
    public static void main(String[] args) {

        Random r = new Random();

        int[][] m = new int[7][7];
        int[] linha = new int[7];
        int[] coluna = new int[7];

        for (int i = 0; i < 7; i++) {
            linha[i] = -9999;
            coluna[i] = 9999;

            for (int j = 0; j < 7; j++) {
                m[i][j] = r.nextInt(100);
            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (m[i][j] > linha[i]) {
                    linha[i] = m[i][j];
                }
                if (m[i][j] < coluna[j]) {
                    coluna[j] = m[i][j];
                }
            }
        }

        System.out.println("Matriz 7x7:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%4d", m[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nMaior de cada linha: ");
        for (int i = 0; i < 7; i++)
            System.out.print(linha[i] + " ");

        System.out.print("\nMenor de cada coluna: ");
        for (int j = 0; j < 7; j++)
            System.out.print(coluna[j] + " ");

    }

}
