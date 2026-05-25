package exemplos.ClasseAbstrata;

public class FuncionarioCLT extends Funcionario{
    private double salarioBase;

    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
