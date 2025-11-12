package desafios;

import java.util.Scanner;

public class Desafio1OpMatematicas {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            int n1 = 0;
            int n2 = 0;
            int resultado = 0;


            System.out.println("      Menu");
            System.out.println("-----------------\n");

            System.out.println("    1) Somar");
            System.out.println("    2) Susbtrair");
            System.out.println("    3) Sair\n");
            System.out.println("-----------------\n");

            System.out.print("Opção: ");
            opcao = teclado.nextInt();

            if (opcao == 1  || opcao ==2) {
                System.out.print("Informe o primeiro número: ");
                n1 = teclado.nextInt();
                System.out.println();

                System.out.print("Informe o segundo número: ");
                n2 = teclado.nextInt();
                System.out.println();

                resultado = (opcao==1) ? (n1 + n2) : (n1 - n2) ;
//
//                if (opcao == 1) {
//                    resultado = n1 + n2;
//                } else {
//                    resultado = n1 - n2;
//                }
                System.out.printf("Resposta: %d",resultado);
                System.out.println("");
            }

            if (opcao <= 0 || opcao >3) {
                System.out.println("Opção inválida!");
            }

        }
                System.out.println("FIM");
                System.out.println();

    }
}
