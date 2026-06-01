package exercicios.classeanonima;

public class OperacaoDemo {
    public static void main(String[] args) {

        Operacao operacao =
                new Operacao() {

                    @Override
                    public int calcular(
                            int a,
                            int b) {

                        return a + b;
                    }
                };

        System.out.println(
                operacao.calcular(10, 20)
        );
    }
}
