import java.util.Scanner;
import java.util.Arrays;

public class Exercicio30 {
        public static void main(String[] args) {
            Scanner y = new Scanner(System.in);

            System.out.println("Qual a quantidade de números que serão inseridos?");
            int x = y.nextInt();

            int[] n = new int[x];

            System.out.println("Digite os numeros:");
            for(int i = 0; i < x; i++) {
                n[i] = y.nextInt();
            }

            Arrays.sort(n);
            System.out.println("Ordem dos números inseridos:" + Arrays.toString(n));
        }
}