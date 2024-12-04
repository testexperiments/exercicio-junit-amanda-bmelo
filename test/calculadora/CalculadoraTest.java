package calculadora;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora c = new Calculadora();

    @Test
    public void testSoma() {
        double soma = c.calc(2.0, 9.0, '+');
        assertEquals(11.0, soma, 0.0);
    }

    @Test
    public void testSubtracao() {
        double subtracao = c.calc(9.0, 9.0, '-');
        assertEquals(0.0, subtracao, 0.0);
    }

    @Test
    public void testMultiplicacao() {
        double multiplicacao = c.calc(9.0, 2.0, '*');
        assertEquals(18.0, multiplicacao, 0.0);
    }

    @Test
    public void testDivisao() {
        double divisao = c.calc(9.0, 2.0, '/');
        assertEquals(4.5, divisao, 0.0);
    }
}
