import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
    void mdcP1Pares() { //testando numeros pares
        final double a = 8, b = 2, esperado = b;
        final double obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcP1NumerosIguais() { //testando numeros iguais
        final double a = 4, b = 4, esperado = b;
        final double obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcP2(){
        final double a = 8, b = 4, divisor = 2;
        //final double esperado = 2;
        // o valor obtido é sempre o resultado da chamada
        //da funçao sendo testada
        final double obtido = MathUtil.mdc(a,b);
        //assertEquals(0, obtido % divisor);
        assertTrue(obtido % divisor == 0); //quando se tem uma condição maior
        // |a| == valor positivo de a
    }
    @Test
    void mdcP3(){
        final double a = 5, esperado = a;
        final double obtido = MathUtil.mdc(a, 0);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP3Positivo(){
        final double a = -5, esperado = a *-1;
        final double obtido = MathUtil.mdc(a,0);
        assertEquals(esperado, obtido);

    }

    @Test
    void mdcP3Negativo(){
        final double a = -5, esperado = a *-1;
        final double obtido = MathUtil.mdc(a,0);
        assertEquals(esperado, obtido);

    }

}