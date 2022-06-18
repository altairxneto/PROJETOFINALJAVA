import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o numero que quer transformar para binario: ");
        int numero = s.nextInt();

        String resposta = binario(numero);

        System.out.println(resposta);
    }

    public static String binario(int valor){
        int contadorDeVezes = 0;
        int experimento = valor;

        while(experimento != 0){
            experimento = experimento/2;

            contadorDeVezes++;
        }

        int[] arraybinario = new int[contadorDeVezes];
        int contadorwhile = contadorDeVezes;

        while(contadorwhile>0) {
            arraybinario[contadorwhile-1] = valor % 2;
            valor = valor / 2;

            contadorwhile--;
        }

        String numerosBinario = "";

        for(int conta = 0; conta<contadorDeVezes; conta++){
            numerosBinario = numerosBinario + arraybinario[conta];
        }

        return numerosBinario;
    }
}
