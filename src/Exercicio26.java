import java.util.Arrays;
import java.util.Scanner;
//x = Contador

public class Exercicio26 {
        public static void main(String[] args) {
            int tamanho, x=0;
            Scanner y = new Scanner(System.in);
            System.out.println("\nDigite a ordem da matriz (quadrada): ");
            tamanho = y.nextInt();

            boolean[][] matriz = new boolean[tamanho][tamanho];
            System.out.println("");
            for (int i=0; i<tamanho; i++) {
                for (int j=0; j<tamanho; j++) {
                    x++;
                    System.out.print("Digite o " + (x) + "º valor lógico: ");
                    matriz[i][j] = y.nextBoolean();

                }
            }

            System.out.println("\nMatriz inicial: ");
            for (int i=0; i<matriz.length; i++) {

                System.out.println(Arrays.toString(matriz[i]));
            }


            System.out.println("\nMatriz final: ");

            for (int i=0; i<matriz.length; i++) {

                for (int j=0; j<matriz.length; j++) {

                    matriz[i][j] = matriz[j][i] && matriz[i][j];
                }
            }
            for (int i=0; i<matriz.length; i++) {

                System.out.println(Arrays.toString(matriz[i]));
            }

            System.out.println("");
            y.close();
        }
}