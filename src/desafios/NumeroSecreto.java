package desafios;

import java.util.Scanner;

public class NumeroSecreto {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        // Math.random() -> 0 (incluido) até 1 (não incluido)
        int secreto = (int) (Math.random() * 100);

        int chute = -1;

        while(chute != secreto) {
            System.out.print("Informe o número (chute): ");
            chute = teclado.nextInt();
            teclado.nextLine();

            if(secreto > chute) {
                System.out.println("Número secreto MAIOR");
            } else if(secreto < chute) {
                System.out.println("Número secreto MENOR");
            }
        }

        System.out.printf("\n\nUm número secreto é %d!", secreto);
        teclado.close();
    }
}
