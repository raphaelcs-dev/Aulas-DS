package codExemplos.animal;

import codExemplos.animal.AnimalAbstracao;
import codExemplos.animal.CachorroAbstract;
import codExemplos.animal.GatoAbstract;

public class TestaAnimal {
    public static void main (String [] args){
        AnimalAbstracao cachorro = new CachorroAbstract("Billy");
        AnimalAbstracao gato = new GatoAbstract("Bibi");

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
