package cap10Deitel;

class Cubo extends FiguraTridimensional {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        return 6 * lado * lado;
    }

    @Override
    public double obtenerVolumen() {
        return lado * lado * lado;
    }

    @Override
    public String descripcion() {
        return "Cubo de lado " + lado;
    }
}
