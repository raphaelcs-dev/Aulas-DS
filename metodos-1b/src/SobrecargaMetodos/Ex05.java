package SobrecargaMetodos;

public class Ex05 {
    public static void main(String[] args) {
        exibir("!");
        exibir("Olá mundo");
    }
    public static void exibir(char caracter){
        System.out.println(caracter);
    }
    public static void exibir(String caracter){
        System.out.println(caracter);
    }
}
