package exercicios.classelocal;

public class ValidadorDemo {
    void validarNumero() {

        class Validador {

            void verificar(int numero) {

                if (numero > 0) {
                    System.out.println("Número positivo");
                } else {
                    System.out.println("Número negativo");
                }
            }
        }

        Validador v = new Validador();

        v.verificar(10);
    }

    public static void main(String[] args) {
        ValidadorDemo validador = new ValidadorDemo();

        validador.validarNumero();
    }
}
