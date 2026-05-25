package exercicios.classeconcreta;

public class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;

        System.out.println("Novo saldo: " + saldo);
    }
}
