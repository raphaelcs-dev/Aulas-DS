package metodosAbstrato;

abstract class AnimalAbs {
    abstract void alimentacao();
}
class Leao extends AnimalAbs {
    void alimentacao(){System.out.println("Carnívoro");}
}
