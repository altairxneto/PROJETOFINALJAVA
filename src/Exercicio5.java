import java.util.Scanner;

public class Exercicio5 {
    public static class main {
        public static void main (String[] args) {
            int x;
            double modulo;
            Scanner n = new Scanner(System.in);
            System.out.println("Informe um valor para descobrir o seu módulo: ");
            x = n.nextInt();

            modulo = x*(-1);

            if (x >= 0) {
                System.out.println("O módulo do valor indicado é: " + x);
            }   else if (x < 0) {
                System.out.println("O módulo do valor indicado é: " + modulo);
            }
        }

    }
}