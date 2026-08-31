package exercicios.ex02;

public class Testaanimal {
    public static void main(String[] args) {

            Animal animal = new Animal();
            Cachorro cachorro = new Cachorro();
            Passaro passaro = new Passaro();

            animal.emitirSom();
            cachorro.emitirSom();
            passaro.emitirSom();
        }
}
