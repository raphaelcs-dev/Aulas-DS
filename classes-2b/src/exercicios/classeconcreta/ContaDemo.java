package exercicios.classeconcreta;

public class ContaDemo {
    public static void main(String[] args) {

        Conta conta = new Conta(
                123,
                1000
        );

        conta.depositar(500);
    }
}
