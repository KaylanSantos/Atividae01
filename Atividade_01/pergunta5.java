/* 5. Em um campeonato de futebol existem cinco times e cada um possui 11 jogadores.
 Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
 calcule e mostre:
 • aquantidade de jogadores com idade inferior a 18 anos;
 • amédia das idades dos jogadores de cada time;
 • amédia das alturas de todos os jogadores do campeonato;
 • aporcentagem de jogadores com mais de 80kg entre todos os jogadores do cam
peonato. */

import java.util.Scanner;

public class pergunta5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = 5;
        int jogadoresPorTime = 11;

        int menoresDe18 = 0;
        double somaAlturas = 0;
        int jogadoresMais80kg = 0;

        for (int t = 1; t <= times; t++) {
            double somaIdadeTime = 0;
            for (int j = 1; j <= jogadoresPorTime; j++) {
                System.out.println("Time " + t + " - Jogador " + j);
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                System.out.print("Peso: ");
                double peso = sc.nextDouble();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();

                if (idade < 18)
                    menoresDe18++;
                if (peso > 80)
                    jogadoresMais80kg++;
                somaAlturas += altura;
                somaIdadeTime += idade;
            }
            System.out.println("Média de idade do time " + t + ": " + (somaIdadeTime / jogadoresPorTime));
        }

        int totalJogadores = times * jogadoresPorTime;
        System.out.println("Quantidade de jogadores com menos de 18 anos: " + menoresDe18);
        System.out.println("Média das alturas de todos os jogadores: " + (somaAlturas / totalJogadores));
        System.out.println(
                "Porcentagem de jogadores com mais de 80kg: " + ((jogadoresMais80kg * 100.0) / totalJogadores) + "%");
    }
}
