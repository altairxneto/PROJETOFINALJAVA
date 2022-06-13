import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua frase: ");
        String frase = s.nextLine();

        String vogais = new String();

        for(int cont = 0; cont < frase.length(); cont++){
            if(frase.charAt(cont) == 'a' || frase.charAt(cont) == 'A'){
                vogais += "a ";
            }
            if(frase.charAt(cont) == 'e' || frase.charAt(cont) == 'E'){
                vogais += "e ";
            }
            if(frase.charAt(cont) == 'i' || frase.charAt(cont) == 'I'){
                vogais += "i ";
            }
            if(frase.charAt(cont) == 'o' || frase.charAt(cont) == 'O'){
                vogais += "o ";
            }
            if(frase.charAt(cont) == 'u' || frase.charAt(cont) == 'U'){
                vogais += "u ";
            }

        }

        System.out.println(vogais);
    }
}
