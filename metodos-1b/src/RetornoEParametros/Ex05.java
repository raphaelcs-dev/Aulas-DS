package RetornoEParametros;

public class Ex05 {
    public static void main(String[] args){
        boolean maiorDeIdade = verificarIdade(16);
        System.out.println(maiorDeIdade);
    }
    public static boolean verificarIdade(int idade){
        return idade >= 18;
    }
}
