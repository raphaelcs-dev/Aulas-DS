package SobrecargaMetodos;

public class Ex03 {
    public static void main(String[] args) {
        exibir("Estou aprendendo Java!");
        exibir("Java é top!", 3);
    }
    public static void exibir(String texto){
        System.out.println(texto);
    }
    public static void exibir(String texto, int numero){
        for (int i = 0; i <= numero; i++){
            System.out.println(texto);
        }
    }
}
