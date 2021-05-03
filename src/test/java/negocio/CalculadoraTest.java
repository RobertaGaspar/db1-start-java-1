package negocio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void dadoDoisNumerosResultarSoma() {
        // setup
        int valor1 = 10;
        int valor2 = 20;
        int valorEsperado = 30;
        Calculadora calculadora = new Calculadora();

        // act
        int resultado = calculadora.somar(valor1, valor2);

        // verify
        assertEquals(valorEsperado, resultado);
    }

    @Test
    void deveMultilplicarDoisNumeroseRetornar() {
        // setup
        int valor1 = 10;
        int valor2 = 2;
        int resultadoEsperado = 20;
        Calculadora calculadora = new Calculadora();

        // act
        int resultado = calculadora.multiplicar(valor1, valor2);

        // verify
        assertEquals(resultadoEsperado, resultado);
    }

    @Test
    void deveLancarExcecaoQuandoHouverOverflow() {
        // setup
        int valor1 = Integer.MAX_VALUE;
        int valor2 = 2;

        Calculadora calculadora = new Calculadora();

        // act
        assertThrows(ArithmeticException.class,
                () -> calculadora.multiplicar(valor1, valor2));

    }

    @Test
    void deveDividirUmNumeroCorretamenteQuandoDividirPorZero(){
        // setup
        int valor1 = 5;
        int valor2 = 0;
        Calculadora calculadora = new Calculadora();

        // act
        assertThrows(ArithmeticException.class,
                () -> calculadora.dividir(valor1, valor2));
    }

    @Test
    void deveDividirUmNumeroCorretamente(){
        // setup
        int valor1 = 5;
        int valor2 = 2;
        double resultadoEsperado = 2.5;
        Calculadora calculadora = new Calculadora();

        // act
        double resultado = calculadora.dividir(valor1, valor2);

        // verify
        assertEquals(resultadoEsperado, resultado);
    }
}