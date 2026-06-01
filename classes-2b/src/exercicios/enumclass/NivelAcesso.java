package exercicios.enumclass;

public enum NivelAcesso {
    ADMIN,
    USUARIO,
    VISITANTE;

    public static void main(String[] args) {
        NivelAcesso acessoAtual = NivelAcesso.ADMIN;

        System.out.println("Nível de acesso atual: " + acessoAtual);

        System.out.println("\nTodos os níveis de acesso:");
        for (NivelAcesso nivel : NivelAcesso.values()) {
            System.out.println(nivel);
        }
    }
}
