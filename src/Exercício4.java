import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os dois valores inteiros para as variaveis A e B respectivamente: ");
        int varA = s.nextInt();
        int varB = s.nextInt();
        int troca1;

        troca1 = varA;
        varA = varB;
        varB = troca1;

        System.out.println("Os valores trocados sao A: "+varA+" B: "+varB);
    }
}
