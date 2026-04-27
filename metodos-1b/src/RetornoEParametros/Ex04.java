package RetornoEParametros;
import java.util.Scanner;

public class Ex04 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira String: ");
        String l1 = concatenar(sc.nextLine());
        System.out.println("Digite a segunda String: ");
        String l2 = concatenar(sc.nextLine());
        System.out.println();
    }
}