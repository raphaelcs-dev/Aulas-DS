package exemplos.InnerClass;

public class Computador {
    private String marca;

    public Computador(String marca) {
        this.marca = marca;
    }

    class Processador {

        private String modelo;

        public Processador(String modelo) {
            this.modelo = modelo;
        }

        public void mostrarDados() {
            System.out.println("Marca: " + marca);
            System.out.println("Processador: " + modelo);
        }
    }
}
