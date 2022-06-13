import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os valores dos seus catetos: ");
        double cat1 = s.nextDouble();
        double cat2 = s.nextDouble();

        System.out.println(hipotenusar(cat1, cat2));
    }

    static double hipotenusar (double cateto1, double cateto2){
        double resultado = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
        return resultado;
    }
}
