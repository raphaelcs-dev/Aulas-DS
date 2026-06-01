package exercicios.innerclass;

public class BancoDemo {
    public static void main(String[] args) {

        Banco banco = new Banco();

        Banco.Agencia agencia =
                banco.new Agencia();

        agencia.mostrar();
    }
}
