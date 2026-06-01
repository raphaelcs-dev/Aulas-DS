package exercicios.enumclass;

public enum DiaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO;

    public static void main(String[] args) {
        DiaSemana hoje = DiaSemana.SEGUNDA;

        System.out.println("Hoje é: " + hoje);

        System.out.println("\nTodos os dias da semana:");
        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }
    }
}
