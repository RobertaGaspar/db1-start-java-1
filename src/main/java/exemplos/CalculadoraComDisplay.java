package exemplos;

public class CalculadoraComDisplay {

    private Impressora impressora;

    public CalculadoraComDisplay(Impressora impressora) {
        this.impressora = impressora;
    }

    public void somar(int a, int b) {
        impressora.imprimir(Math.addExact(a, b));
    }

    public void multiplicar(int a, int b) {
        impressora.imprimir(Math.multiplyExact(a, b));
    }

    public void dividir(double divisor, double dividendo) {
        if (dividendo == 0)
            throw new ArithmeticException("Divisão por zero não é permitida.");

        impressora.imprimir(divisor / dividendo);
    }

    public void subtrair(int valor1, int valor2) {
        impressora.imprimir(Math.subtractExact(valor1, valor2));
    }
}
