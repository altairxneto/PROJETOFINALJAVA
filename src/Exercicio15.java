import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite os 10 numeros do seu vetor: ");
        int[] vetor = new int[10];

        int num = 0;
        int numX = 0;
        int maior = 0;
        int menor = 0;
        int igual = 0;

        for(int cont = 0; cont < 10; cont++){
            int verificador = 2;
            while(verificador > 1){
                System.out.println("Digite um numero inteiro maior que zero para a posicao "+cont+" do seu vetor: ");
                num = s.nextInt();

                if(num > 0){
                    verificador--;
                }
                else{
                    System.out.println("DIGITE UM NUMERO MAIOR QUE ZERO!");
                }

            }

            vetor[cont] = num;
        }

        int verificador2 = 2;
        while(verificador2>1){
            System.out.println("Digite seu numero X, deve ser inteiro e maior que zero: ");
            numX = s.nextInt();

            if(numX > 0){
                verificador2--;
            }
            else{
                System.out.println("DIGITE UM NUMERO MAIOR QUE ZERO");
            }
        }

        for(int contador = 0; contador < 10; contador++){
            if(vetor[contador]>numX){
                maior++;
            }
            else if(vetor[contador]<numX){
                menor++;
            }
            else{
                igual++;
            }
        }

        System.out.println("Maiores: "+maior+" Menores: "+menor+" Iguais: "+igual);
    }
}
