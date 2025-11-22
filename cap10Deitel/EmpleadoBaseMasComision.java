package cap10Deitel;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, Fecha fechaNacimiento,
                                   double ventasBrutas, double tarifaComision, double salarioBase) {
        super(nombre, apellido, nss, fechaNacimiento, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    public void establecerSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
    public double obtenerSalarioBase() { return salarioBase; }

    @Override
    public double ingresos() { return salarioBase + super.ingresos(); }

    @Override
    public String toString() {
        return String.format("Empleado base más comisión: %s\nSalario base: $%,.2f",
                super.toString(), salarioBase);
    }
}