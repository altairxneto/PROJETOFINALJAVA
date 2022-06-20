import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o tamamanho da matriz:");
        int tamanho = s.nextInt();

        int[][] matriz = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {

            for (int j = 0; j < tamanho; j++) {

                System.out.println("Digite o valor da coluna " + j + " da linha " + i);
                matriz[i][j] = s.nextInt();
            }
        }

        int novaMatriz[][] = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {

            for (int j = 0; j < tamanho; j++) {
                novaMatriz[i][j] = matriz[j][i];
            }
        }

        System.out.println("Matriz informada pelo usuário:");
        System.out.println("");

        for (int i = 0; i < tamanho; i++) {

            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println("");
        }

        System.out.println("Matriz com as linhas trocadas com as colunas:");
        System.out.println("");

        for (int i = 0; i < tamanho; i++) {

            for (int j = 0; j < tamanho; j++) {
                System.out.print(novaMatriz[i][j] + " ");
            }

            System.out.println("");
        }
    }
}
