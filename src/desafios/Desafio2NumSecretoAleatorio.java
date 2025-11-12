package desafios;

import java.util.Scanner;

public class Desafio2NumSecretoAleatorio {
    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("chute um número entre 0 e 100: ");
        int numero = teclado.nextInt();

        int secreto = (int) (Math.random() * 100);


        int tentativa = 1;

        while (numero != secreto) {


            secreto = (int) (Math.random() * 100);
            tentativa++;


        }
        System.out.printf("número de tentativas: %d \n", tentativa);
        System.out.printf("O número secreto é %d ", secreto);
    }
}
