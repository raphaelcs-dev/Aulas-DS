package exercicios.ex01;

import exercicios.ex01.Estudante;

public class TestaPessoa {
    public static void main(String[]args){

        Estudante estudante = new Estudante();

        estudante.setNome("Raphael");
        estudante.setIdade(16);
        estudante.setMatricula(2026001);
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Matrícula: " + estudante.getMatricula());
    }

}

