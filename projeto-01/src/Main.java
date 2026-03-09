import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double n2 = sc.nextDouble();

        double diferenca = Math.abs(n1 - n2);

        System.out.printf("A diferença de %.2f para %.2f é de %.2f%n", n1, n2, diferenca);


    }

}
