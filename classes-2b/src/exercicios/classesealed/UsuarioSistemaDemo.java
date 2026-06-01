package exercicios.classesealed;

public class UsuarioSistemaDemo {

    public static void main(String[] args) {

        UsuarioSistema usuario =
                new Administrador();

        System.out.println(
                usuario.getClass()
                        .getSimpleName()
        );
    }
}
