package repeticao;

import java.util.Scanner;

public class Switch3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o dia da semana: ");
        String diaDaSemana = teclado.nextLine();

        switch (diaDaSemana) {
            case "segunda" -> System.out.println("Inicio da semana!");
            case "sexta" -> System.out.println("Sextouuuuu!");
            case "sábado" -> System.out.println("Uhuuuuu! Sabadão");
            case "domingo" -> System.out.println("Ficar só lesando");
            default -> System.out.println("Trabalhando demais");
        }

        teclado.close();
    }
}
