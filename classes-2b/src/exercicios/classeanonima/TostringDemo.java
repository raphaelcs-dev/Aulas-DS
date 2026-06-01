package exercicios.classeanonima;

public class TostringDemo {
    public static void main(String[] args) {

        Object objeto =
                new Object() {

                    @Override
                    public String toString() {

                        return "Classe Anônima";
                    }
                };

        System.out.println(
                objeto
        );
    }
}
