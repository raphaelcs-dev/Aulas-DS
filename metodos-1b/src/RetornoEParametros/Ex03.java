package RetornoEParametros;
import java.util.Scanner;

public class Ex03 {
    public static void main (String[]args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite o número que será dobrado: ");
       int numero = dobro(sc.nextInt());
       System.out.println("O dobro é : " + numero);
    }
    public static int dobro(int numero) {
        return numero * 2;
    }
}
