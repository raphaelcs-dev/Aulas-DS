package exercicios.classesealed;

public sealed class Dispositivo
        permits Notebook,
        Tablet {
}
