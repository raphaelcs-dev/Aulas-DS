package exemplos.InnerClass;

public class InnerClassDemo {
    public static void main(String[] args) {

        Computador pc = new Computador("Dell");

        Computador.Processador proc =
                pc.new Processador("Intel i7");

        proc.mostrarDados();
    }
}
