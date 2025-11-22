package cap8Deitel;

public class RacionalEjercicios {
    private int numerador;
    private int denominador;

    // Constructor sin argumentos: 0/1
    public RacionalEjercicios() {
        this(0, 1);
    }

    // Constructor con argumentos
    public RacionalEjercicios(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("El denominador no puede ser 0");
        }

        // Manejar signo (el signo siempre en el numerador)
        if (den < 0) {
            num = -num;
            den = -den;
        }

        int mcd = mcd(Math.abs(num), Math.abs(den));
        this.numerador = num / mcd;
        this.denominador = den / mcd;
    }

    // Sumar
    public RacionalEjercicios sumar(RacionalEjercicios r) {
        int num = this.numerador * r.denominador + r.numerador * this.denominador;
        int den = this.denominador * r.denominador;
        return new RacionalEjercicios(num, den);
    }

    // Restar
    public RacionalEjercicios restar(RacionalEjercicios r) {
        int num = this.numerador * r.denominador - r.numerador * this.denominador;
        int den = this.denominador * r.denominador;
        return new RacionalEjercicios(num, den);
    }

    // Multiplicar
    public RacionalEjercicios multiplicar(RacionalEjercicios r) {
        int num = this.numerador * r.numerador;
        int den = this.denominador * r.denominador;
        return new RacionalEjercicios(num, den);
    }

    // Dividir
    public RacionalEjercicios dividir(RacionalEjercicios r) {
        if (r.numerador == 0) {
            throw new ArithmeticException("Division entre 0 no permitida");
        }
        int num = this.numerador * r.denominador;
        int den = this.denominador * r.numerador;
        return new RacionalEjercicios(num, den);
    }

    // a/b
    public String aString() {
        return numerador + "/" + denominador;
    }

    // Punto flotante con precisión
    public String aDecimal(int decimales) {
        double valor = (double) numerador / denominador;
        return String.format("%." + decimales + "f", valor);
    }

    // MCD con algoritmo de Euclides
    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
