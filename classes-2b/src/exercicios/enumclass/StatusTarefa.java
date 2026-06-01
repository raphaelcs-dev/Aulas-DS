package exercicios.enumclass;

public enum StatusTarefa {
    PENDENTE,
    EM_ANDAMENTO,
    CONCLUIDA;

    public static void main(String[] args) {
        StatusTarefa status = StatusTarefa.PENDENTE;

        System.out.println("Status inicial: " + status);

        status = StatusTarefa.EM_ANDAMENTO;
        System.out.println("Status atualizado: " + status);

        status = StatusTarefa.CONCLUIDA;
        System.out.println("Status final: " + status);

        System.out.println("\nTodos os status possíveis:");
        for (StatusTarefa s : StatusTarefa.values()) {
            System.out.println(s);
        }
    }
}
