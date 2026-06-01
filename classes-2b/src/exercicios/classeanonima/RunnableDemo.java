package exercicios.classeanonima;

public class RunnableDemo {
    public static void main(String[] args) {

        Runnable runnable =
                new Runnable() {

                    @Override
                    public void run() {

                        System.out.println(
                                "Executando thread"
                        );
                    }
                };

        runnable.run();
    }
}
