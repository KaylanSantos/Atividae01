/*14. Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os
 códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados
 em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo
 código) e os saldos devem ser armazenados em um vetor de números reais. O saldo
 deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi
 armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta
 posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o
 seguinte menu na tela:
• Efetuar depósito
 • Efetuar saque
 • Consultar o ativo bancário (soma de todos os saldos)
 • Finalizar programa
 Obs.1: ao depositar, deve-se solicitar o valor e9 o código da conta a receber o depósito.
 Obs.2: para sacar, a mesma coisa. Também, deve-se verificar se tem saldo suficiente
 para o saque */

import java.util.Scanner;

public class pergunta14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] codigos = new int[10];
        double[] saldos = new double[10];
        int i = 0;

        while (i < 10) {
            System.out.print("Código da conta " + (i + 1) + ": ");
            int codigo = sc.nextInt();
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (codigos[j] == codigo) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Código repetido! Tente outro.");
                continue;
            }

            codigos[i] = codigo;
            System.out.print("Saldo da conta " + codigo + ": ");
            saldos[i] = sc.nextDouble();
            i++;
        }

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\n1-Depósito  2-Saque  3-Ativo  4-Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Conta para depósito: ");
                int c = sc.nextInt();
                boolean achou = false;

                for (int j = 0; j < codigos.length; j++) {
                    if (codigos[j] == c) {
                        System.out.print("Valor: ");
                        saldos[j] += sc.nextDouble();
                        System.out.printf("Saldo agora: R$ %.2f\n", saldos[j]);
                        achou = true;
                        break;
                    }
                }

                if (!achou) {
                    System.out.println("Conta não existe!");
                }

            } else if (opcao == 2) {
                System.out.print("Conta para saque: ");
                int c = sc.nextInt();
                boolean achou = false;

                for (int j = 0; j < codigos.length; j++) {
                    if (codigos[j] == c) {
                        System.out.print("Valor: ");
                        double v = sc.nextDouble();
                        if (saldos[j] >= v) {
                            saldos[j] -= v;
                            System.out.println("Saque ok! Novo saldo: R$" + saldos[j]);
                        } else {
                            System.out.println("Saldo insuficiente!");
                        }
                        achou = true;
                        break;
                    }
                }

                if (!achou) {
                    System.out.println("Conta não existe!");
                }

            } else if (opcao == 3) {
                double total = 0;
                for (double s : saldos)
                    total += s;
                System.out.printf("Ativo total: R$ %.2f\n", total);

            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }

        System.out.println("saindo...");
        sc.close();
    }
}
