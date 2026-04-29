package SobrecargaMetodos;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do lado do quadrado: ");
        int lado = input.nextInt();

        System.out.println("Área do quadrado: " + area(lado));

        System.out.println("Digite o tamanho da base do retângulo: ");
        int base = input.nextInt();
        System.out.println("Digite a altura do retângulo: ");
        int altura = input.nextInt();

        System.out.println("Área do retângulo: " + area(base,altura));
    }

    public static int area(int lado){
        return (lado*lado);
    }
    public static int area(int base, int altura){
        return (base * altura);
    }
}
