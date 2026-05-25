package exercicios.classeconcreta;

public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void mostrarResultado() {

        if (nota >= 6) {
            System.out.println(nome + " aprovado");
        } else {
            System.out.println(nome + " reprovado");
        }
    }
}
