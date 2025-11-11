package repeticao;

import java.util.Scanner;

public class DoWhile {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        String comando = "";

        do {
            System.out.print("Informe o comando ou sair: ");
            comando = teclado.nextLine();
            System.out.println("Comando: " + comando);
        } while (!comando.equals("sair"));

        System.out.println("Fim!");
        teclado.close();
    }
}
