/*10. Faça um programa que receba dez números inteiros e mostre a quantidade de números
 primos dentre os número que foram digitados */

import java.util.Scanner;

public class pergunta10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contPrimos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + " valor:");
            int num = sc.nextInt();

            boolean primo = true;

            if (num <= 1) {
                primo = false;
            } else {
                for (int v = 2; v <= Math.sqrt(num); v++) {
                    if (num % v == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            if (primo) {
                contPrimos++;
            }
        }

        System.out.println("Ha " + contPrimos + " valores primos");
        sc.close();
    }
}
