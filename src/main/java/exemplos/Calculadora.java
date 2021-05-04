package exemplos;

public class Calculadora {

    public int somar(int a, int b) {
        return Math.addExact(a, b);
    }

    public int multiplicar(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    public double dividir(double divisor, double dividendo) {
        if (dividendo == 0)
            throw new ArithmeticException("Divisão por zero não é permitida.");

        return divisor / dividendo;
    }

    public int subtrair(int valor1, int valor2) {
        return Math.subtractExact(valor1, valor2);
    }
}
