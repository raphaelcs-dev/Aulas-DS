package exemplos.ClasseAnonima;

public class AnonimaDemo {
    public static void main(String[] args) {

        Saudacao s = new Saudacao() {

            @Override
            public void mostrarMensagem() {

                System.out.println("Olá! Esta mensagem vem de uma classe anonima!");
            }
        };

        s.mostrarMensagem();
    }
}
