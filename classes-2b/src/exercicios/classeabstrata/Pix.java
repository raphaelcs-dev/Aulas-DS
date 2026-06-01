package exercicios.classeabstrata;

public class Pix extends Pagamento {
    @Override
    public void processar() {
        System.out.println("Pagamento processado");
    }
}
