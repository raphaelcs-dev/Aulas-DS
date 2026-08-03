package codExemplos.animal;

import codExemplos.animal.AnimalAbstracao;

public class GatoAbstract extends AnimalAbstracao {
    public GatoAbstract(String nome){
        super(nome);
    }
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}
