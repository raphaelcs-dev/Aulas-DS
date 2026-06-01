package exercicios.enumclass;

public enum CorSemaforo {
    VERDE,
    AMARELO,
    VERMELHO;

    public static void main(String[] args) {
        CorSemaforo corAtual = CorSemaforo.VERDE;

        System.out.println("Cor atual do semáforo: " + corAtual);

        corAtual = CorSemaforo.AMARELO;
        System.out.println("Próxima cor: " + corAtual);

        corAtual = CorSemaforo.VERMELHO;
        System.out.println("Última cor: " + corAtual);
    }
}
