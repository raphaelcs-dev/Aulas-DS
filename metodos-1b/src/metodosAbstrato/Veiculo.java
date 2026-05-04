package metodosAbstrato;

abstract class Veiculo {
    abstract void tipoCombustivel();
}
class Moto extends Veiculo {
    void tipoCombustivel(){System.out.println("Gasolina");}
}
