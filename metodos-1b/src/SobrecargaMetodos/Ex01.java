package SobrecargaMetodos;

public class Ex01 {
    public static void main(String[] args){
        exibir(5);
        exibir(3.7);
    }
    public static void exibir(int n1){
        System.out.println(n1);
    }
    public static void exibir(double n2){
        System.out.println(n2);
    }
}
