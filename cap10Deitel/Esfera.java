package cap10Deitel;

class Esfera extends FiguraTridimensional {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    public double obtenerVolumen() {
        return (4.0 / 3.0) * Math.PI * radio * radio * radio;
    }

    @Override
    public String descripcion() {
        return "Esfera de radio " + radio;
    }
}

