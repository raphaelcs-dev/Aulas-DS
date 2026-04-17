package RetornoEParametros;

public class Ex01 {
    public static void main(String[] args) {
        int resultado = multiplicar(5,5);
        System.out.println("O resultado da multiplicação: " + resultado);
    }
    public static int multiplicar(int a, int b){
        return a*b;
    }
}
