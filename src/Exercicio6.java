import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int varA = 0, varB = 0, varC = 0;
        int menor = 0, maior = 0;
        int cont = 0, cont1 = 0, cont2 = 0;

        while (cont < 1) {
            System.out.println("Digite o valor de A: ");
            varA = s.nextInt();

            if (varA <= 0) {
                System.out.println("Digite um valor maior que 0.");
            } else {
                cont++;
            }
        }
        maior = varA;

        while (cont1 < 1) {
            System.out.println("Digite o valor de B: ");
            varB = s.nextInt();

            if (varB <= 0) {
                System.out.println("Digite um valor maior que 0.");
            } else {
                cont1++;
            }
        }
        if(varB>varA){
            maior = varB;
            menor = varA;
        }
        else{
            maior = varA;
            menor = varB;
        }

        while (cont2 < 1) {
            System.out.println("Digite o valor de C: ");
            varC = s.nextInt();

            if (varC <= 0) {
                System.out.println("Digite um valor maior que 0.");
            } else {
                cont2++;
            }
        }
        if(varC>maior){
            maior = varC;
        }
        else if(varC<menor){
            menor = varC;
        }

        int res1 = menor*maior;
        int res2 = maior/menor;

        System.out.println("O menor valor lido multiplicado pelo maior: "+res1+" .Maior valor dividido pelo menor: "+res2);
    }
}

