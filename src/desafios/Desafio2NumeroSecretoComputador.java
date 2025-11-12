package desafios;

import java.util.Scanner;

public class Desafio2NumeroSecretoComputador {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("chute um número entre 0 e 100: ");
        int numero = teclado.nextInt();

        int chuteComp = -1;
        int ultimoChute = chuteComp;
        int tentativa =0;
        while (chuteComp != numero ) {
            ultimoChute = chuteComp;
            if (chuteComp > numero) {  // numero é menor
                chuteComp = chuteComp/2 ;
            } else {

                chuteComp =  chuteComp+((ultimoChute - chuteComp)/2);
            }
            System.out.println("Chute.. " + chuteComp);
            System.out.println("TChute.. " + chuteComp);

        }
        System.out.printf("O número secreto é %d ",chuteComp);
    }
}
