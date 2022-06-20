import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        boolean parar= false;
        do{
            System.out.println("Digite um numero inteiro: ");
            int x= s.nextInt();


            if(x%2==0){
                System.out.print("O numero eh par\n");
            }else{
                System.out.print("O numero nao eh par\n");
            }
            if(x<0){
                System.out.println("O numero eh negativo");
            }else{
                System.out.println("O numero eh positivo");
            }
            char resposta;
            System.out.println("Deseja sair? (s/N)? ");
            resposta = s.next().charAt(0);
            if(resposta == 's' || resposta == 'S'){
                parar = true;
            }

        }while(parar==false);
    }
}