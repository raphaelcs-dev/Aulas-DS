package RetornoEParametros;
import java.util.Scanner;

public class Ex04 {
    public static void main (String[] args){
       String resultado = concatenar("Olá", "Raphael");
       System.out.println(resultado);
    }
    public static String concatenar (String s1, String s2) {
        return s1 + s2;
    }
}