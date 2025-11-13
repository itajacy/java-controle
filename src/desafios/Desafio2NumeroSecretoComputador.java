package desafios;

import java.util.Scanner;

public class Desafio2NumeroSecretoComputador {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("chute um número entre 0 e 100: ");
        int numero = teclado.nextInt();

        int min = 0;
        int max = 100;

        int chute = -1;
        int tentativas = 0;
        while (chute != numero) {
            chute = (max - min) / 2 + min;
            tentativas++;
            if (chute > numero) {  // numero é menor
                max = chute;
            } else {
                min = chute;
//
            }
            System.out.printf("Chute.. %d  Min: %d  Max: %d ", chute, min, max);
            System.out.println();

        }
        System.out.println("tentativas.. " + tentativas);
        System.out.printf("O número secreto é %d ", chute);
    }
}
