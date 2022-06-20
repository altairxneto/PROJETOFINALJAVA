import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Digite a cotacao do dolar: ");
        double a= s.nextDouble();

        System.out.println("Digite um valor em dolares: ");
        double b= s.nextDouble();

        double real= a*b;

        System.out.println("O valor convertido para real eh: "+real);

    }
}
