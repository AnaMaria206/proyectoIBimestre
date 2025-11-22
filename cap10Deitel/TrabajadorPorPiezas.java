package cap10Deitel;

public class TrabajadorPorPiezas extends Empleado {
    private double sueldoPorPieza;
    private int piezasProducidas;

    public TrabajadorPorPiezas(String nombre, String apellido, String nss, Fecha fechaNacimiento,
                               double sueldoPorPieza, int piezasProducidas) {
        super(nombre, apellido, nss, fechaNacimiento);
        this.sueldoPorPieza = sueldoPorPieza;
        this.piezasProducidas = piezasProducidas;
    }

    public void establecerSueldoPorPieza(double sueldoPorPieza) { this.sueldoPorPieza = sueldoPorPieza; }
    public double obtenerSueldoPorPieza() { return sueldoPorPieza; }

    public void establecerPiezasProducidas(int piezas) { this.piezasProducidas = piezas; }
    public int obtenerPiezasProducidas() { return piezasProducidas; }

    @Override
    public double ingresos() {
        return sueldoPorPieza * piezasProducidas;
    }

    @Override
    public String toString() {
        return String.format("Trabajador por piezas: %s\nSueldo por pieza: $%,.2f; Piezas producidas: %d",
                super.toString(), sueldoPorPieza, piezasProducidas);
    }
}
