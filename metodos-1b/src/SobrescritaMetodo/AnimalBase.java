package SobrescritaMetodo;

class AnimalBase {
    void emitirSom(){System.out.println("Som");}
}
class Cachorro extends AnimalBase {
    void emitirSom(){System.out.println("Au Au!");}
}
