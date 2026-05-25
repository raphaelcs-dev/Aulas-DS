package exemplos.NestedClass;

public class Empresa {
    static class Departamento {

        private String nome;

        public Departamento(String nome) {
            this.nome = nome;
        }

        public void mostrar() {
            System.out.println(nome);
        }
    }
}
