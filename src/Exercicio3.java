import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro número (a): ");
        int a = s.nextInt();
        System.out.println("Digite o segundo número (b): ");
        int b = s.nextInt();
        System.out.println("Digite o terceiro número (c): ");
        int c = s.nextInt();

        if(a==b){
            System.out.println("'a' é igual a 'b' ");
        }
        if(b==c){
            System.out.println("'b' é igual a 'c' ");
        }
        if(c==a){
            System.out.println("'c' é igual a 'a' ");
        }
        if(a!=b){
            System.out.println("'a' é diferente de 'b' ");
        }
        if(b!=c){
            System.out.println("'b' é diferente de 'c' ");
        }
        if(c!=a){
            System.out.println("'c' é diferente de 'a' ");
        }
        if(a>b){
            System.out.println("'a' é maior que 'b' ");
        }
        if(b>c){
            System.out.println("'b' é maior que 'c' ");
        }
        if(c>a){
            System.out.println("'c' é maior que 'a' ");
        }
        if(a<b){
            System.out.println("'a' é menor que 'b' ");
        }
        if(b<c){
            System.out.println("'b' é menor que 'c' ");
        }
        if(c<a){
            System.out.println("'c' é menor que 'a' ");
        }
        if(a>=b){
            System.out.println("'a' é maior ou igual a 'b' ");
        }
        if(b>=c){
            System.out.println("'b' é maior ou igual a 'c' ");
        }
        if(c>=a){
            System.out.println("'c' é maior ou igual a 'a' ");
        }
        if(a<=b){
            System.out.println("'a' é menor ou igual a 'b' ");
        }
        if(b<=c){
            System.out.println("'b' é menor ou igual a 'c' ");
        }
        if(c<=a){
            System.out.println("'c' é menor ou igual a 'a' ");
        }
    }

}