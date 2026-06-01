package exercicios.classesealed;

public class MidiaDemo {
    public static void main(String[] args) {

        Midia midia =
                new LivroDigital();

        System.out.println(
                midia.getClass()
                        .getSimpleName()
        );
    }
}
