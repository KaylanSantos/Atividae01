/*1. Faça um programa que recebe o número de horas trabalhadas, e o valor da hora traba
lhada. Calcule e mostre o salário a receber seguindo estas regras:
• o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
hora trabalhada;
• o imposto equivale a 30% do salário bruto;
• o salário a receber equivale ao salário bruto menos o imposto. */

import java.util.Scanner;

public class pergunta1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas horas vc trabalhou ?");
        double horas = sc.nextDouble();

        System.out.println("Qual o valor por hora ?");
        double valor = sc.nextDouble();

        double salbru = horas * valor;
        double imp = salbru * 0.3;
        double sal = salbru - imp;

        System.out.println("Imposto a descontar: " + imp);
        System.out.println("Salario a receber: " + sal);
        System.out.println("Salario bruto: " + salbru);

        sc.close();

    }

}
