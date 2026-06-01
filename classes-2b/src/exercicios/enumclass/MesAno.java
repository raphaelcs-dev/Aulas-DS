package exercicios.enumclass;

public enum MesAno {
    JANEIRO,
    FEVEREIRO,
    MARCO,
    ABRIL,
    MAIO;

    public static void main(String[] args) {
        MesAno mesAtual = MesAno.MAIO;

        System.out.println("Mês atual: " + mesAtual);

        System.out.println("\nTodos os meses:");
        for (MesAno mes : MesAno.values()) {
            System.out.println(mes);
        }
    }
}
