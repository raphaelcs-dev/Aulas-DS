package exercicios.classesealed;

public sealed class UsuarioSistema
        permits Administrador,
        Cliente {
}
