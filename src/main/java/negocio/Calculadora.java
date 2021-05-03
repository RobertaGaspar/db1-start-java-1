package negocio;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int multiplicar(int valor1, int valor2) {
        return Math.multiplyExact(valor1, valor2);
    }

    public double dividir(double valor1, double valor2) {
        if (valor2 == 0)
            throw new ArithmeticException("Não dá pra fazer");

        return valor1 / valor2;
    }
}
