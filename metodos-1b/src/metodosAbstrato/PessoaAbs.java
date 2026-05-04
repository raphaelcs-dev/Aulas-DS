package metodosAbstrato;

abstract class PessoaAbs {
    abstract void profissao();
}
class Medico extends PessoaAbs {
    void profissao(){System.out.println("Médico");}
}
