import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String frase = "";

        int contador = 1;

        System.out.println("Digite a frase que tenha ate 50 caracteres: ");

        while(contador>0){
            frase = s.nextLine();

            if(frase.length()>50){
                System.out.println("Deve ser menos que 50 caracteres");
            } else{
                contador--;
            }
        }

        String[] array = frase.split(" ");

        int resultado = array.length-1;

        String fraseSemEspaco = "";
        for(int cont = 0; cont < array.length; cont++){
            fraseSemEspaco += array[cont];
        }
        System.out.println("A frase sem os espacos e: '"+fraseSemEspaco+"'. O numero de espacos na frase e: "+resultado);
    }
}
