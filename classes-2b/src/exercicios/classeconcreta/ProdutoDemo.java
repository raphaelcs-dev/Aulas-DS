package exercicios.classeconcreta;

public class ProdutoDemo {
    public static void main(String[] args) {

        Produto produto = new Produto(
                "Mouse",
                150
        );

        produto.exibirPreco();
    }
}
