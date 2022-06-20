import java.util.Scanner;

public class Exercicio27 {
    public static class main {
        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            System.out.println("Informe a quantidade de linhas:");
            int linhas = s.nextInt();

            System.out.println("Informa a quantidade de colunas:");
            int colunas = s.nextInt();

            int[][] matriz = new int[linhas][colunas];

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.println("Informe o valor da coluna " + j + " da linha " + i + ": ");
                    matriz[i][j] = s.nextInt();
                }
            }

            int maior = matriz[0][0];
            int menor = matriz[0][0];

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {

                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j];
                    }

                    if (matriz[i][j] < menor) {
                        menor = matriz[i][j];
                    }
                }
            }

            System.out.println("O maior valor é: " + maior);
            System.out.println("O menor valor é: " + menor);
        }
    }
}