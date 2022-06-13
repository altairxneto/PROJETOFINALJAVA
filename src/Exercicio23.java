import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double resultado = 0;

        double salario;
        System.out.println("Digite o valor do seu salario: ");
        salario = s.nextDouble();

        System.out.println("Agora digite o valor do reajuste em %: ");
        double reajuste = s.nextDouble();

        if (reajuste < 0) {
            resultado = salario + (salario * reajuste) / 100;

            System.out.println("O valor do seu salario reajustado e: " + resultado);
            return;
        }
        resultado = salario + (salario * reajuste) / 100;

        System.out.println("O valor do seu salario reajustado e: " + resultado);
    }

}
