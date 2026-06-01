package exercicios.classesealed;

public sealed class Conta
        permits ContaCorrente,
        ContaPoupanca {
}
