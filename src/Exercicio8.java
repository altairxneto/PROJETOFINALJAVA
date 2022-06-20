import java.util.Scanner;

public class Exercicio8 {
    public static class main {
        public static void main (String[] args) {
            int x, i;
            double modulo;
            Scanner n = new Scanner(System.in);
            System.out.println("Informe um valor para tabuada: ");
            x = n.nextInt();

            System.out.printf("A tabuada do %d é: \n", x);

            for (i=1; i<=10; i++) {
                System.out.printf("%d x %d = %d\n", x, i, (x*i));
            }

        }

    }
}