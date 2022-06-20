import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean parar = false;
        do {
            System.out.println("Digite o indice de poluicao(positivo): ");
            double x = s.nextDouble();

            if (x >= 0.05 && x <= 0.25) {
                System.out.println("Indice de poluicao aceitavel.");
            } else if (x == 0.3){
                System.out.println("Suspender as atividades das industrias do primeiro grupo. ");
            }
            else if (x == 0.4) {
                System.out.println("Suspender as atividades das industrias do primeiro e segundo grupo.");
            }
            else if (x == 0.5) {
                System.out.println("Suspender atividades das industrias do primeiro, segundo e terceiro grupo.");
            }
            else {
                System.out.println("Indice de poluicao nao classificado. ");
            }

            char letra;
            System.out.println("\nDeseja encerrar o programa? (s/N) ");
            letra = s.next().charAt(0);
            if (letra == 's' || letra == 'S') {
                parar = true;
            }

        } while (parar == false);


    }
}
