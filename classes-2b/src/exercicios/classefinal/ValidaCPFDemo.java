package exercicios.classefinal;

public class ValidaCPFDemo {
    public static void main(String[] args) {

        ValidaCPF validador =
                new ValidaCPF();

        System.out.println(
                validador.validar("12345678901")
        );
    }
}
