package exercicios.innerclass;

public class EscolaDemo {
    public static void main(String[] args) {

        Escola escola = new Escola();

        Escola.Turma turma =
                escola.new Turma();

        turma.mostrar();
    }
}
