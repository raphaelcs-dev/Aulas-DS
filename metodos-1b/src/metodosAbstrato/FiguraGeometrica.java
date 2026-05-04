package metodosAbstrato;

abstract class FiguraGeometrica {
    abstract double area();
}
class Retangulo extends FiguraGeometrica {
    double area(){return 2*3;}
}
