package codExemplos.interfaces;

public class TestaFormaInterfaces {
    public static void main (String[] args){
        FormaInterfaces circulo = new CirculoInterfaces(2);
        FormaInterfaces retangulo = new RetanguloInterfaces(3,4);

        System.out.println("Área do circulo: " + circulo.calcularArea());
        System.out.println("Área do retângulo: " +retangulo.calcularArea());
    }
}
