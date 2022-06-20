import java.util.Scanner;

public class Exercicio13 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int graos = 1, x;
            int quantGraos = 1;

            System.out.println("Digite a quantidade de quadros");
            int quantidade = s.nextInt();

            for (x = 2; x <=quantidade; x++) {
                quantGraos = quantGraos*2;
                graos += quantGraos;
            }

            System.out.println("O valor do pagamento é de "+graos+" grãos.");

        }
}
