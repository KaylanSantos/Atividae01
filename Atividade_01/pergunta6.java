/* 6. Faça um programa que leia um número e calcule o fatorial desse número */

import java.util.Scanner;

public class pergunta6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num = sc.nextInt();

        int x = num;
        int fato = 1;

        while (num >= 1) {
            fato = fato * num;
            num--;
        }
        System.out.println("O fatorial de " + x + " e " + fato);
        sc.close();

    }

}