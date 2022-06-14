import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tentativas = 0;
        int contador = 1;

        double num = Math.random()*50;

        System.out.println("Digite o numero que voce acha que seja: ");
        double numhipotetico = s.nextDouble();

        if(numhipotetico==num){
            System.out.println("Uau, voce acertou!");
        } else{

            System.out.println("Voce errou, tente novamente!");

            while(contador > 0){
                numhipotetico = s.nextDouble();

                if(numhipotetico>num){
                    System.out.println("O numero digitado e maior que o numero sorteado, tente novamente!");
                    tentativas++;
                } else if(numhipotetico<num){
                    System.out.println("O numero digitado e menor que o numero sorteado, tente novamente!");
                    tentativas++;
                } else if(numhipotetico==num){
                    System.out.println("Acertou!");
                    contador--;
                }
            }

        }

    }
}
