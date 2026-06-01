package exercicios.innerclass;

public class JogoDemo {
    public static void main(String[] args) {

        Jogo jogo = new Jogo();

        Jogo.Jogador jogador =
                jogo.new Jogador();

        jogador.mostrar();
    }
}
