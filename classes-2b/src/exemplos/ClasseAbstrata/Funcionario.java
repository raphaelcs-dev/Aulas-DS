package exemplos.ClasseAbstrata;

abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void mostrarNome() {
        System.out.println("Funcionário: " + nome);
    }

    public abstract double calcularSalario();
}
