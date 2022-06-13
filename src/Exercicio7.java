import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] numeros;
        System.out.println("Quantos numeros sao?");
        int quantidade = s.nextInt();

        numeros = new int[quantidade];

        int resultado = 0;

        for (int contador = 0; contador < quantidade; contador++) {
            System.out.println("Qual o seu numero " + (contador + 1) + "?");
            numeros[contador] = s.nextInt();
        }

        int fato, aux;
        for (int i = 0; i < quantidade; i++) {
            aux = numeros[i];

            for(fato = 1; aux>1; aux = aux - 1){
                fato = fato*aux;
            }

            System.out.println("O fatorial de " + numeros[i] + " e: " + fato);
        }
    }
}
