package metodosAbstrato;

abstract class InstrumentoMusical {
    abstract void tocar();
}
class Violao extends InstrumentoMusical {
    void tocar(){System.out.println("Tocando violão");}
}
