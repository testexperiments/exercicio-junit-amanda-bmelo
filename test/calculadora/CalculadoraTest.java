package calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora c = new Calculadora();

    @Test
    public void testSoma() {
        double soma = c.calc(2.0, 9.0, '+');
        Assertions.assertEquals(11.0, soma, 0.0);
    }

    @Test
    public void testSubtracao() {
        double subtracao = c.calc(9.0, 9.0, '-');
        Assertions.assertEquals(0.0, subtracao, 0.0);
    }

    @Test
    public void testMultiplicacao() {
        double multiplicacao = c.calc(9.0, 2.0, '*');
        Assertions.assertEquals(18.0, multiplicacao, 0.0);
    }

    @Test
    public void testDivisao() {
        double divisao = c.calc(9.0, 2.0, '/');
        Assertions.assertEquals(4.5, divisao, 0.0);
    }

    @Test
    public void testPrimitiveReturn() {
        double multiplicacao = c.calc(9.0, 0.0, '*');
        Assertions.assertEquals(0.0, multiplicacao, 0.0);
        // testar tipo retornado
    }

    @Test
    public void testError() {
        RuntimeException thrown = Assertions.assertThrowsExactly(RuntimeException.class, () -> {
            c.calc(9.0, 2.0, '=');
            throw new IllegalArgumentException("Invalid operation");
        });
        Assertions.assertEquals("Invalid operation", thrown.getMessage());
    }
}
