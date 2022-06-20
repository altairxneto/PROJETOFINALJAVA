import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a quantidade mínima: ");
        int qtde_min = s.nextInt();
        System.out.println("Agora, informe a quantidade máxima: ");
        int qtde_max = s.nextInt();

        int estoque_med = (qtde_min + qtde_max)/2;

        System.out.println("O seu estoque médio é: "+estoque_med);
    }
}