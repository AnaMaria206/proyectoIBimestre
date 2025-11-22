package cap10Deitel;

class Tetraedro extends FiguraTridimensional {
    private double lado;

    public Tetraedro(double lado) {
        this.lado = lado;
    }

    @Override
    public double obtenerArea() {
        return Math.sqrt(3) * lado * lado;
    }

    @Override
    public double obtenerVolumen() {
        return (Math.pow(lado, 3)) / (6 * Math.sqrt(2));
    }

    @Override
    public String descripcion() {
        return "Tetraedro de lado " + lado;
    }
}
