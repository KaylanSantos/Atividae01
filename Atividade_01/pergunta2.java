/* 2. Sabe-se que o quilowatt de energia custa 1% do salário mínimo. Faça um programa
 que recebe o valor do salário mínimo e a quantidade de quilowatts consumida por uma
 residência, calcule e mostre:
 • ovalor de cada quilowatt;
 • ovalor a ser pago por essa residência;*/

import java.util.Scanner;

public class pergunta2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor do salario minimo atual:");
        double sal = sc.nextDouble();
        System.out.println("Quantidade de quilowatts consumidos:");
        double wat = sc.nextDouble();

        double val = sal * 0.01;
        double pag = val * wat;

        System.out.println("Valor de cada quilowatt: " + val);
        System.out.println("Valor a ser pago: " + pag);

        sc.close();

    }

}
