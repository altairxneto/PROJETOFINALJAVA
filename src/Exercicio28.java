import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean primeiraIteracao = true;
        int maior = 0;
        int menor = 0;

        System.out.println("Digite a sua quantidade de linhas e colunas: ");
        int linhas = s.nextInt();
        int colunas = s.nextInt();
        int[][] n = new int[linhas][colunas];

        for (int i =0;i<linhas;i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("valores");
                n[i][j]= s.nextInt();
            }
        }
        for(int i=0;i<linhas;i++){
            for(int j=0;j<colunas;j++){
                if(primeiraIteracao == true){
                    maior = n[i][j];
                    menor = n[i][j];
                    primeiraIteracao = false;
                }
                if(n[i][j] > maior){
                    maior = n[i][j];
                }else if(n[i][j] < menor){
                    menor = n[i][j];
                }
            }
        }
        System.out.println("O maior valor é " +maior+" e o menor valor é "+menor);
    }
}
