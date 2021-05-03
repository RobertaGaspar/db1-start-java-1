package negocio;

public class Calculadora {
    public int somar(int a, int b){
        return a + b;
    }

    public int multiplicar(int valor1, int valor2) {
        return Math.multiplyExact(valor1, valor2);
    }
}
