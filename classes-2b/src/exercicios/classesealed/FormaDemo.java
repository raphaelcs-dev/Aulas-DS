package exercicios.classesealed;

public class FormaDemo {

    public static void main(String[] args) {

        Forma forma =
                new Circulo();

        System.out.println(
                forma.getClass()
                        .getSimpleName()
        );
    }
}
