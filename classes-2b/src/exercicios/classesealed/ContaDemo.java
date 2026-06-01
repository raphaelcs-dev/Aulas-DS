package exercicios.classesealed;

    public class ContaDemo {

        public static void main(String[] args) {

            Conta conta =
                    new ContaCorrente();

            System.out.println(
                    conta.getClass()
                            .getSimpleName()
            );
        }
    }

