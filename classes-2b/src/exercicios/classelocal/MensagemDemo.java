package exercicios.classelocal;

public class MensagemDemo {
    void exibirMensagem() {

        class Mensagem {

            void mostrar() {
                System.out.println("Ph lindo demais");
            }
        }

        Mensagem mensagem = new Mensagem();
        mensagem.mostrar();
    }

    public static void main(String[] args) {
        MensagemDemo m = new MensagemDemo();

        m.exibirMensagem();
    }
}
