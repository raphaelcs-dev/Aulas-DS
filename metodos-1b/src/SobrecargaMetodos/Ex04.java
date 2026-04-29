package SobrecargaMetodos;

public class Ex04 {
    public static void main(String[] args) {
        somar(1,3);
        somar(1,3,5);
        somar(1,3,5,8);
    }
    public static void somar(int a, int b){
        int soma = a + b;
        System.out.println("A soma de " + a + " + " + b + " é igual a " + soma);
    }
    public static void somar(int a, int b, int c){
        int soma = a + b + c;
        System.out.println("A soma de " + a + " + " + b +  " + " + c +" é igual a " + soma);
    }
    public static void somar(int a, int b, int c, int d){
        int soma = a + b + c + d;
        System.out.println("A soma de " + a + " + " + b +  " + " + c + " + " + d + " é igual a " + soma);
    }

}

