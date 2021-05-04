package exemplos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class CalculadoraComDisplayTest {

    private Impressora mockImpressora;

    @BeforeEach
    void Setup() {
        mockImpressora = mock(Impressora.class);
    }

    @Test
    void deveLancarExcecaoQuandoHouverOverflowNaSoma() {
        // setup
        int valor1 = Integer.MAX_VALUE;
        int valor2 = 1;
        CalculadoraComDisplay calculadoraComDisplay = new CalculadoraComDisplay(mockImpressora);

        // act
        assertThrows(ArithmeticException.class,
                () -> calculadoraComDisplay.somar(valor1, valor2));

        // verify
        verifyNoInteractions(mockImpressora);
    }

    @Test
    void deveImprimirSomaDeDoisNumeros() {
        // setup
        int valor1 = 10;
        int valor2 = 20;
        int valorEsperado = 30;
        CalculadoraComDisplay calculadoraComDisplay = new CalculadoraComDisplay(mockImpressora);

        // act
        calculadoraComDisplay.somar(valor1, valor2);

        // verify
        verify(mockImpressora).imprimir(valorEsperado);
        verify(mockImpressora, times(1)).imprimir(valorEsperado);
    }
}