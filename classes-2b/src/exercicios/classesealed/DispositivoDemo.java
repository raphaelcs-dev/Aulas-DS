package exercicios.classesealed;

public class DispositivoDemo {

    public static void main(String[] args) {

        Dispositivo dispositivo =
                new Notebook();

        System.out.println(
                dispositivo.getClass()
                        .getSimpleName()
        );
    }
}
