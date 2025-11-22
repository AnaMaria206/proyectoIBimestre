package cap10Deitel;

public class EmpleadoPorHoras extends Empleado {
    private double sueldoPorHora;
    private double horasTrabajadas;

    public EmpleadoPorHoras(String nombre, String apellido, String nss, Fecha fechaNacimiento, double sueldoPorHora, double horasTrabajadas) {
        super(nombre, apellido, nss, fechaNacimiento);
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double ingresos() {
        if (horasTrabajadas <= 40)
            return sueldoPorHora * horasTrabajadas;
        else
            return 40 * sueldoPorHora + (horasTrabajadas - 40) * sueldoPorHora * 1.5;
    }

    @Override
    public String toString() {
        return String.format("Empleado por horas: %s\nSueldo por hora: $%,.2f; Horas trabajadas: %,.2f",
                super.toString(), sueldoPorHora, horasTrabajadas);
    }
}