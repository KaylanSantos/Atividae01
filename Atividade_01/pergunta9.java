/* 9. Faça um programa que leia um número inteiro e diga se ele é primo */

import java.util.Scanner;

public class pergunta9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero:");
        int num = sc.nextInt();

        boolean primo = true;

        if (num <= 1) {
            primo = false;
        }
        // Não sabia q eu podia delacar minha variavel dentro do for, achei legal isso
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println(num + " e primo !!");
        } else {
            System.out.println(num + " nao e primo !!");
        }

        sc.close();
    }

}
