import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
//import static  pacote.MathUtil.*;

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
        final double a = 5, esperado = a;
        final double obtido = MathUtil.mdc(a,0);
        assertEquals(esperado, obtido);

    }

    @Test
    void mdcP3Negativo(){
        final double a = -5, esperado = 5;
        final double obtido = MathUtil.mdc(a,0);
        assertEquals(esperado, obtido);

    }
    @Test
    void mdcP4(){
        final double m = 5, a = 6, b = 3;
        final double esperado = MathUtil.mdc(m*a, m*b);
        final double obtido = m * MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcP6(){
        final double a = 8, b=4;
        final double esperado = MathUtil.mdc(a, b);
        final double obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);
        //se valor deo actual der -1 significa que não há implementação para o teste
    }

    @Test
        //se os numeros são primos não obte mdc, vai ser 1
    void mdcP7(){
        final double a = 12, b = 3;
        final double esperado = MathUtil.mdc(-a,b);
        final double obtido = MathUtil.mdc(a, -b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcP7Primos(){
        final double a = 7, b = 3;
        final double esperado = MathUtil.mdc(-a,b);
        final double obtido = MathUtil.mdc(a, -b);
        assertEquals(esperado, obtido);
        System.out.println("esperado: " + esperado + " obtido: " + obtido);

    }
    @Test
        //quando se tem 1 funcao, o resultado é o "obtido" da funcao
    void mdcP12UmNumeroPrimo(){
        final double p = 7;
        final double a = 2;
        //mdc(p,a) == p ou 1
        final double obtido = MathUtil.mdc(p ,a);
        assertEquals(1, obtido);
    }

    @Test
    void mdcP12UmNumeroPrimoIguais(){

        final double p = 7;
        final double a = 7;
        //mdc(p,a) == p ou 1
        final double obtido = MathUtil.mdc(p ,a);
        System.out.println("esperado: " + p + " obtido: " + obtido);
        assertEquals(p, obtido);
    }
    @Test  //calculando o mdc até que os nueros sejam iguais
    void mdcCasoGeralPares() { //testando numeros pares
        final double a = 12, b = 8, esperado = 4;
        final double obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }
    @Test
    void mdcMultiplosValores(){
        //MathUtil.mdc(12,8,4); passando individualmente
        //final double[] valores = {12,8,4};  //passando em vetor
        final double esperado = 4;
        final double obtido = MathUtil.mdc(12,8,4);
        assertEquals(esperado, obtido);
        //MathUtil.mdc(valores);
    }
}