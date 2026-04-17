package MetodosComParametros;

public class Ex04 {
    public static void main(String[] args) {
        obterResultado(-5);
    }
    public static void obterResultado(int numero){
        if (numero >=0){
            System.out.println(numero + " É positivo");
        }
        else{
            System.out.println(numero + " É negativo");
        }

    }
}
