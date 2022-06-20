import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.print("Digite o primeiro caractere: ");
        char caractere = s.nextLine().charAt(0);

        System.out.println("Digite o segundo caractere: ");
        char caractere2 = s.nextLine().charAt(0);

        int posicaoChar1 = alfabeto.indexOf(caractere);
        int posicaoChar2 = alfabeto.indexOf(caractere2);

        if (posicaoChar2 < posicaoChar1) {
            System.out.println("Os caracteres nao estao em ordem alfabetica");
            return;
        }

        int caracteresEntre = (posicaoChar2 - posicaoChar1) - 1;
        System.out.println("O numero de caracteres entre eles eh: " + caracteresEntre);
    }
}