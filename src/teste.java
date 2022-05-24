import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int x = 1;
        while (x>0){
            System.out.println("E agora?");
            char resp = s.next().charAt(0);
            System.out.println(resp=='S');
            System.out.println("Deseja encerrar o programa");
            if(resp == 'S') {
                x--;
            }

        }
    }
}
