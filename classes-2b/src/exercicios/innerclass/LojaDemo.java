package exercicios.innerclass;

public class LojaDemo {
    public static void main(String[] args) {

        Loja loja = new Loja();

        Loja.Caixa caixa =
                loja.new Caixa();

        caixa.mostrar();
    }
}
