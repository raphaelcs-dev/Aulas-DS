package exercicios.classeabstrata;

public class GeometricaDemo {
    public static void main(String[] args) {

        FiguraGeometrica figura =
                new Quadrado(5);

        System.out.println(
                figura.calcularArea()
        );
    }
}
