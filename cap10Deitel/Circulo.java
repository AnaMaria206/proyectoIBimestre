package cap10Deitel;

class Circulo extends FiguraBidimensional {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String descripcion() {
        return "Círculo de radio " + radio;
    }
}