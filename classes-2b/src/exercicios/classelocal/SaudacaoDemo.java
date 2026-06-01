package exercicios.classelocal;

public class SaudacaoDemo {
    void saudar() {

        class Saudacao {

            void mostrar() {
                System.out.println("Bem-vindo ao mundo dos espertos!");
            }
        }

        Saudacao s = new Saudacao();

        s.mostrar();
    }

    public static void main(String[] args) {
        SaudacaoDemo saudacao = new SaudacaoDemo();

        saudacao.saudar();
    }
}
