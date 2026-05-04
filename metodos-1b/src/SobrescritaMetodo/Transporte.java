package SobrescritaMetodo;

class Transporte {
    void mover(){System.out.println("Movendo");}
}
class Carro extends Transporte {
    void mover(){System.out.println("O carro está em movimento");}
}
