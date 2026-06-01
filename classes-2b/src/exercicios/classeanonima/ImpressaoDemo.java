package exercicios.classeanonima;

public class ImpressaoDemo {
    public static void main(String[] args) {

        Impressao impressao =
                new Impressao() {

                    @Override
                    public void imprimir() {

                        System.out.println(
                                "Imprimindo..."
                        );
                    }
                };

        impressao.imprimir();
    }
}
