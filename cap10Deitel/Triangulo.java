package cap10Deitel;

class Triangulo extends FiguraBidimensional {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    @Override
    public String descripcion() {
        return "Triángulo de base " + base + " y altura " + altura;
    }
}
