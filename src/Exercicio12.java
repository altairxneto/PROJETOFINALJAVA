import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String numerosDigitados = new String();

        for (;;) {
            System.out.println("Digite um número:");
            int numero = s.nextInt();

            if (numero == 0) {
                break;
            }else{
                numerosDigitados += numero + ",";
            }
        }

        String[] arrayDeNumerosDigitados = numerosDigitados.split(",");

        int[] numeros = new int[arrayDeNumerosDigitados.length];

        for(int i = 0; i < arrayDeNumerosDigitados.length; i++){
            numeros[i] = Integer.parseInt(arrayDeNumerosDigitados[i]);
        }

        int maior = 0;
        int menor = 0;
        boolean primeiroLoop = true;

        for(int i = 0; i < numeros.length; i++){

            if (primeiroLoop){
                menor = numeros[i];
                primeiroLoop = false;
            }

            if (numeros[i] > maior){
                maior = numeros[i];
            } else if(numeros[i] < menor){
                menor = numeros[i];
            }
        }

        System.out.println("O maior número é:" + maior);
        System.out.println("O menor número é:" + menor);
    }
}
