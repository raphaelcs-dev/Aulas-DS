package codExemplos.animal;

import codExemplos.animal.AnimalAbstracao;

public class CachorroAbstract extends AnimalAbstracao {
        public CachorroAbstract(String nome){
            super(nome);
        }

        @Override
        public void emitirSom(){
            System.out.println("Au, au!");
        }
    }

