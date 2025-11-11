package desafios;

import java.util.Scanner;

public class OperacoesMatematicas {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        int opcao = 0;

        while(opcao != 3) {
            System.out.print("Menu\n--------\n1) Somar\n2) Subtrair\n3) Sair\n\nInforme a opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine(); // \n

            if(opcao != 3) {
                System.out.print("Informe o primeiro valor: ");
                double n1 = teclado.nextDouble();
                teclado.nextLine(); // \n

                System.out.print("Informe o segundo valor: ");
                double n2 = teclado.nextDouble();
                teclado.nextLine(); // \n

                double resultado = 0;

                switch (opcao) {
                    case 1 -> resultado = n1 + n2;
                    case 2 -> resultado = n1 - n2;
                }

                System.out.printf("Resultado: %.2f\n\n", resultado);
            }
        }

        teclado.close();
    }
}
