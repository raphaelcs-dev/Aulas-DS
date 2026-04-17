package RetornoEParametros;

public class Ex02 {
    public static void main(String[] args) {
        String msg = boasVindas("Raphael");
        System.out.println(msg);
    }

    public static String boasVindas(String nome) {
        return "Bem-vindo, " + nome + "!";
    }
}
