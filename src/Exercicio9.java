import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        for(;;){
            System.out.println("Informe o seu código: ");
            int C = s.nextInt();
            System.out.println("Agora, informe o número de horas trabalhadas: ");
            int N = s.nextInt();

            int salario = N*10;
            System.out.println("Seu salário total: "+salario);

            if(N>50){
                int A = N-50;
                int excedente = A*20;
                System.out.println("Seu salário excedente: "+excedente);
            }
            System.out.println("Gostaria de encerrar o programa? (S / N): ");
            String resposta = s.next();

            if(resposta.equalsIgnoreCase("S")){
                break;
            }
        }
    }
}
