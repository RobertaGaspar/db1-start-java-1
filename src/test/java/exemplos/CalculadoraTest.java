package exemplos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void deveRetornarSomaDeDoisNumeros() {
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
    void deveLancarExcecaoQuandoHouverOverflowNaSoma() {
        // setup
        int valor1 = Integer.MAX_VALUE;
        int valor2 = 1;
        Calculadora calculadora = new Calculadora();

        // act
        assertThrows(ArithmeticException.class,
                () -> calculadora.somar(valor1, valor2));
    }

    @Test
    void deveRetornarSubtracaoDeDoisNumeros() {
        // setup
        int valor1 = 50;
        int valor2 = 20;
        int valorEsperado = 30;
        Calculadora calculadora = new Calculadora();

        // act
        int resultado = calculadora.subtrair(valor1, valor2);

        // verify
        assertEquals(valorEsperado, resultado);
    }

    @Test
    void deveLancarExcecaoQuandoHouverUnderflowNaSubtracao() {
        // setup
        int valor1 = Integer.MIN_VALUE;
        int valor2 = 1;
        Calculadora calculadora = new Calculadora();

        // act
        assertThrows(ArithmeticException.class,
                () -> calculadora.subtrair(valor1, valor2));
    }

    @Test
    void deveRetornarMultiplicacaoDeDoisNumeros() {
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
    void deveLancarExcecaoQuandoHouverOverflowNaMultiplicacao() {
        // setup
        int valor1 = Integer.MAX_VALUE;
        int valor2 = 2;
        Calculadora calculadora = new Calculadora();

        // act
        assertThrows(ArithmeticException.class,
                () -> calculadora.multiplicar(valor1, valor2));
    }

    @Test
    void deveRetornarDivisaoDeDoisNumeros() {
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

    @Test
    void deveLancarExcecaoQuandoDividirPorZero() {
        // setup
        int valor1 = 5;
        int valor2 = 0;
        Calculadora calculadora = new Calculadora();

        // act
        assertThrows(ArithmeticException.class,
                () -> calculadora.dividir(valor1, valor2));
    }
}