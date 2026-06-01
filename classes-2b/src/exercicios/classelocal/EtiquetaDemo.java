package exercicios.classelocal;

public class EtiquetaDemo {
    void criarEtiqueta() {

        class Etiqueta {

            void mostrarTitulo() {
                System.out.println("Ultimas peças no estoque");
            }
        }

        Etiqueta e = new Etiqueta();

        e.mostrarTitulo();
    }

    public static void main(String[] args) {
        EtiquetaDemo etiqueta = new EtiquetaDemo();

        etiqueta.criarEtiqueta();
    }
}
