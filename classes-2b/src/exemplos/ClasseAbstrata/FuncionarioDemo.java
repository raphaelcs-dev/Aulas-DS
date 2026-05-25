package exemplos.ClasseAbstrata;

public class FuncionarioDemo {
    public static void main(String[] args) {

        Funcionario f = new FuncionarioCLT("João", 3500);

        f.mostrarNome();

        System.out.println(f.calcularSalario());
    }
}
