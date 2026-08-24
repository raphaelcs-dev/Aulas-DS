package exercicios.ex02;

public class Testaanimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();

        System.out.println("Animal:");
        animal.emitirSom();

        System.out.println();

        System.out.println("Cachorro:");
        cachorro.emitirSom(); }
}
