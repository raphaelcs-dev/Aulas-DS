package exercicios.classeabstrata;

public class PagamentoDemo {
    public static void main(String[] args) {

        Pagamento pagamento = new Pix();

        pagamento.processar();
    }
}
