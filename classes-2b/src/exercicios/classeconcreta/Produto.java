package exercicios.classeconcreta;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirPreco() {
        System.out.println(nome + " custa R$" + preco);
    }
}
