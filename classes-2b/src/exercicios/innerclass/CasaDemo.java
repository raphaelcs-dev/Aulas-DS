package exercicios.innerclass;

public class CasaDemo {
    public static void main(String[] args) {

        Casa casa = new Casa();

        Casa.Quarto quarto =
                casa.new Quarto();

        quarto.mostrar();
    }
}
