/*3. Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
 obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles.
  */

import java.util.Scanner;

public class pergunta3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro angulo");
        int ang1 = sc.nextInt();
        System.out.println("Segundo angulo");
        int ang2 = sc.nextInt();
        System.out.println("Terceiro angulo");
        int ang3 = sc.nextInt();

        if (ang1 + ang2 + ang3 == 180) {
            if (ang1 == 90 || ang2 == 90 || ang3 == 90) {
                System.out.println("trinagulo retangulo");
            } else if (ang2 < 90 || ang2 < 90 || ang3 < 90) {
                System.out.println("triangulo obtusangulo");
            } else {
                System.out.println("triangulo acutangulo ");
            }
        } else {
            System.out.println("Triangulo invalido pelos graus !!");
        }

        System.out.println("Primeiro lado");
        int lado1 = sc.nextInt();
        System.out.println("Segundo lado");
        int lado2 = sc.nextInt();
        System.out.println("Terceiro lado");
        int lado3 = sc.nextInt();

        if (lado1 < (lado2 + lado3)) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triangulo equilatero");
            } else if (lado1 == lado2 && lado2 != lado3) {
                System.out.println("Triangulo isosceles");
            } else {
                System.out.println("Tiangulo escaleno");
            }

        } else {
            System.out.println("Triangulo invalido pelos lados !!");
        }

        sc.close();

    }

}
