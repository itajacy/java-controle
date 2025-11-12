package desafios;

import java.util.Scanner;

public class Desafio2NumSecreto {

    static void main() {

        int secreto = (int) (Math.random() * 100);

        int chute = -1;
        String mensagem ;

        Scanner teclado = new Scanner(System.in);
        while (chute != secreto) {

            System.out.print("chute um número: ");
            chute = teclado.nextInt();

            mensagem = chute > secreto ? "Chute um número menor "
                    : chute < secreto ? "Chute um número maior"
                    : "Você Acertou!";

            System.out.println(mensagem);


        }
            System.out.printf("O número secreto é %d ",secreto);
    }
}
