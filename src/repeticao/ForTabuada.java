package repeticao;

public class ForTabuada {
    static void main() {
        for (int linha = 1; linha < 10; linha++) {
            for (int coluna = 1; coluna <= 10; coluna++) {

                System.out.printf("%d x %d = %d | ", linha, coluna, (linha * coluna));
            }
            System.out.println();
        }
    }
}
