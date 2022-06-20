import java.util.Scanner;
import java.util.Arrays;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int soma = 0;
        int maior = 0;

        System.out.println("Digite a quantidade de números que serão lidos: ");
        int qtde = s.nextInt();
        int[] numeros = new int[qtde];

        for(int i=0; i<qtde; i++){
            System.out.println("Digite o(s) número(s): ");
            numeros[i] = s.nextInt();

            soma += numeros[i];

            if(numeros[i]>maior){
                maior=numeros[i];
            }
        }
        int media = soma/qtde;
        System.out.println("A média dos valores digitados é "+media+ " e o maior valor é "+maior);
    }
}
