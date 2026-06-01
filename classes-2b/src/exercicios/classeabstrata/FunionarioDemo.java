package exercicios.classeabstrata;

public class FunionarioDemo {
    public static void main(String[] args) {

        Funcionario funcionario =
                new Gerente();

        System.out.println(
                funcionario.calcularBonus()
        );
    }
}
