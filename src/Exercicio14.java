import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numerosEmString = "";

        for(;;){
            System.out.println("Digite um número (para encerrar a execução, digite um número negativo):");
            int numero = s.nextInt();

            if (numero < 0){
                break;
            }

            numerosEmString += numero + ",";
        }

        String[] vetorDeNumerosEmString = numerosEmString.split(",");
        int[] vetorDeNumeros = new int[vetorDeNumerosEmString.length];

        for(int i=0;i<vetorDeNumerosEmString.length;i++){
            vetorDeNumeros[i] = Integer.parseInt(vetorDeNumerosEmString[i]);
        }

        int tamanhoDaMatrizQuadrada = 0;
        if (vetorDeNumeros.length % 2 ==0){
            tamanhoDaMatrizQuadrada = (int) (vetorDeNumeros.length/2) - 1;
        }else{
            tamanhoDaMatrizQuadrada = (int) (vetorDeNumeros.length/2);
        }

        System.out.println("Tamanho da matriz quadrada : " + tamanhoDaMatrizQuadrada + "x" + tamanhoDaMatrizQuadrada);
        System.out.println("Tamanho do vetor de números : " + vetorDeNumeros.length);

        int[][] matriz = new int[tamanhoDaMatrizQuadrada][tamanhoDaMatrizQuadrada];

        int posicaoDoVetor = 0;

        for(int i=0;i<tamanhoDaMatrizQuadrada;i++){

            for(int j=0;j<tamanhoDaMatrizQuadrada;j++){

                if (posicaoDoVetor >= vetorDeNumeros.length){
                    matriz[i][j] = 0;
                }else{
                    matriz[i][j] = vetorDeNumeros[posicaoDoVetor];
                    posicaoDoVetor++;
                }
            }

            posicaoDoVetor++;
        }

        System.out.println("Vetor convertido em matriz:");
        System.out.println("");
        for(int i=0; i<tamanhoDaMatrizQuadrada;i++){

            for(int j=0;j<tamanhoDaMatrizQuadrada;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}