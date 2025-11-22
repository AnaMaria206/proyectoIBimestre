package cap10Deitel;

public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String nombre, String apellido, String nss, Fecha fechaNacimiento, double ventas, double tarifa) {
        super(nombre, apellido, nss, fechaNacimiento);
        this.ventasBrutas = ventas;
        this.tarifaComision = tarifa;
    }

    @Override
    public double ingresos() {
        return ventasBrutas * tarifaComision;
    }

    @Override
    public String toString() {
        return String.format("Empleado por comisión: %s\nVentas brutas: $%,.2f; Tarifa: %.2f",
                super.toString(), ventasBrutas, tarifaComision);
    }
}