package calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        double resultado = c.calc(2.0, 5.0, '+');

        System.out.println(resultado);
    }
}