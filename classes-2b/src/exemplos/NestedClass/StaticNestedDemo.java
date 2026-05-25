package exemplos.NestedClass;

public class StaticNestedDemo {
    public static void main(String[] args) {

        Empresa.Departamento d =
                new Empresa.Departamento("Financeiro");

        d.mostrar();
    }
}
