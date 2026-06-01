package exercicios.recordclass;

public class RecordDemo {
    public static void main(String[] args) {

        Produto produto =
                new Produto(
                        "Mouse",
                        150
                );

        Cidade cidade =
                new Cidade(
                        "São Paulo",
                        "SP"
                );

        Filme filme =
                new Filme(
                        "Matrix",
                        1999
                );

        Coordenada coordenada =
                new Coordenada(
                        10,
                        20
                );

        Usuario usuario =
                new Usuario(
                        "raphael",
                        "email@email.com"
                );

        System.out.println(produto);
        System.out.println(cidade);
        System.out.println(filme);
        System.out.println(coordenada);
        System.out.println(usuario);
    }
}
