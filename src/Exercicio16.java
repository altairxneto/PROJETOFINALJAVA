import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int candidatas = 4;
        int qtde_aptas = 0;
        String[] nome = new String[candidatas];
        int[] idade = new int[candidatas];

        for(int i=0;i<candidatas;i++){
            System.out.print("Digite o nome e a idade da candidata: ");
            nome[i]= s.nextLine();
            idade[i] = Integer.parseInt(s.nextLine());

            if(idade[i]>17 && idade[i]<21){
                qtde_aptas++;
            }
        }

        String[] nome_aptas = new String[qtde_aptas];
        int[] idade_aptas = new int[qtde_aptas];

        int j=0;
        for(int x=0;x<candidatas;x++){
            if(idade[x]>17 && idade[x]<21){
                nome_aptas[j] = nome[x];
                idade_aptas[j] = idade[x];
                j++;
            }
        }
        for(int i=0;i<qtde_aptas;i++){
            System.out.println(nome[i]+ " é uma canditada apta.");
        }
        if(qtde_aptas==0){
            System.out.println("Não há canditadas aptas.");
        }
    }
}
