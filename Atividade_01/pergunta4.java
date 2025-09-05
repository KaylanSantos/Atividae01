/* 4. Faça um programa que receba
 • Ocódigo do produto comprado;
 • Aquantidade comprada do produto
 Calcule e mostre:
 • Opreço unitário do produto comprado, seguindo a Tabela I;
 • Opreço total da nota;
 • Ovalor do desconto, seguindo a Tabela II e aplicado sobre o preço total da nota;
 • Opreço final da nota depois do desconto.
 Tabela I
 Código
 1 a10 
 Preço
 R$ 10,00
 11 a 20
 R$ 15,00
 21 a 30
 R$ 20,00
 31 a 40
 R$ 40,00 
 
 Tabela II
 Preço Total da Nota
 %deDesconto
 Até R$ 250,00
 5%
 Entre R250,00eR 500,00 10%
 Acima de R$ 500,00
 15%*/

import java.util.Scanner;

public class pergunta4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código do produto:");
        int codigo = sc.nextInt();

        System.out.println("Digite a quantidade comprada:");
        int quantidade = sc.nextInt();

        double precoUnitario = 0;

        if (codigo >= 1 && codigo <= 10) {
            precoUnitario = 10.0;
        } else if (codigo >= 11 && codigo <= 20) {
            precoUnitario = 15.0;
        } else if (codigo >= 21 && codigo <= 30) {
            precoUnitario = 20.0;
        } else if (codigo >= 31 && codigo <= 40) {
            precoUnitario = 40.0;
        } else {
            System.out.println("Código inválido!");
            System.exit(0);
        }

        double precoTotal = precoUnitario * quantidade;

        double desconto = 0;
        if (precoTotal <= 250) {
            desconto = precoTotal * 0.05;
        } else if (precoTotal <= 500) {
            desconto = precoTotal * 0.10;
        } else {
            desconto = precoTotal * 0.15;
        }

        double precoFinal = precoTotal - desconto;

        System.out.printf("Preço unitário: R$ %.2f\n", precoUnitario);
        System.out.printf("Preço total: R$ %.2f\n", precoTotal);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Preço final: R$ %.2f\n", precoFinal);
    }
}
