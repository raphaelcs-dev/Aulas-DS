package exercicios.classelocal;

public class CalculadoraDemo {
    void calcular() {

        class Calculadora {

            int somar(int a, int b) {
                return a + b;
            }
        }

        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.somar(5, 3));
    }

    public static void main(String[] args) {
        CalculadoraDemo c = new CalculadoraDemo();

        c.calcular();
    }
}
