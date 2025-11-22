package cap10Deitel;

public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String nombre, String apellido, String nss, Fecha fechaNacimiento, double salarioSemanal) {
        super(nombre, apellido, nss, fechaNacimiento);
        this.salarioSemanal = salarioSemanal;
    }

    public void establecerSalarioSemanal(double salario) { this.salarioSemanal = salario; }
    public double obtenerSalarioSemanal() { return salarioSemanal; }

    @Override
    public double ingresos() { return salarioSemanal; }

    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s\nSalario semanal: $%,.2f",
                super.toString(), salarioSemanal);
    }
}