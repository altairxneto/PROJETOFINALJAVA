import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Defina quantas componentes em cada vetor (no maximo 50): ");
        int n = s.nextInt();

        int[] v1 = new int[n];
        int[] v2 = new int[n];
        int iguais = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Incluir em v1: ");
            v1[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Incluir em v2: ");
            v2[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (v1[i] == v2[i]) {
                iguais++;
            }
            System.out.println("Iguais: " + iguais);
        }
    }
}
