package exemplos.ClasseLocal;

public class Relatorio {
    public void gerar() {

        class Cabecalho {

            private String titulo;

            public Cabecalho(String titulo) {
                this.titulo = titulo;
            }

            public void mostrar() {
                System.out.println(titulo);
            }
        }

        Cabecalho c =
                new Cabecalho("Relatório");

        c.mostrar();
    }
}
