package exemplos.SealedClass;

sealed class Veiculo permits Carro, Moto {

    public void mover() {
        System.out.println("Veículo andando");
    }
}