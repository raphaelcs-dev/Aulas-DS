package exercicios.classeanonima;

public class AlarmeDemo {
    public static void main(String[] args) {

        Alarme alarme =
                new Alarme() {

                    @Override
                    public void tocar() {

                        System.out.println(
                                "Alarme tocando"
                        );
                    }
                };

        alarme.tocar();
    }
}
