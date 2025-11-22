package cap10Deitel;

public abstract class Empleado implements Pagar {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private Fecha fechaNacimiento;

    public Empleado(String nombre, String apellido, String nss, Fecha fechaNacimiento) {
        this.primerNombre = nombre;
        this.apellidoPaterno = apellido;
        this.numeroSeguroSocial = nss;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String obtenerPrimerNombre() { return primerNombre; }
    public String obtenerApellidoPaterno() { return apellidoPaterno; }
    public String obtenerNumeroSeguroSocial() { return numeroSeguroSocial; }
    public Fecha obtenerFechaNacimiento() { return fechaNacimiento; }

    @Override
    public String toString() {
        return String.format("%s %s\nNúmero de seguro social: %s\nFecha de nacimiento: %s",
                primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);
    }

    public abstract double ingresos();

    @Override
    public double obtenerMontoPago() { return ingresos(); }
}