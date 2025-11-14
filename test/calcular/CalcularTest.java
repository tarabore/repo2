package calcular;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalcularTest {

    public CalcularTest() {
    }

    /**
     * Test of sumar method, of class Calcular.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        double numero1 = 8.0;
        double numero2 = 4.0;
        Calcular instance = new Calcular();
        double expResult = 12.0;
        double result = instance.sumar(numero1, numero2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of restar method, of class Calcular.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        double numero1 = 5.0;
        double numero2 = 3.0;
        Calcular instance = new Calcular();
        double expResult = 2.0;
        double result = instance.restar(numero1, numero2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of multiplicar method, of class Calcular.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double numero1 = 6.0;
        double numero2 = 4.0;
        Calcular instance = new Calcular();
        double expResult = 24.0;
        double result = instance.multiplicar(numero1, numero2);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of dividir method, of class Calcular.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double numero1 = 15.0;
        double numero2 = 5.0;
        Calcular instance = new Calcular();
        double expResult = 3.0;
        double result = instance.dividir(numero1, numero2);
        assertEquals(expResult, result, 0);
    }

}
