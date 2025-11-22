package cap9Deitel;

public class EmpleadoBaseMasComisionComposicion {
    private EmpleadoPorComision3 empleado; // objeto interno para composicion
    private double salarioBase;

    // constructor con seis argumentos
    public EmpleadoBaseMasComisionComposicion(
            String nombre, String apellido, String nss,
            double ventas, double tarifa, double salario)
    {
        // se crea el objeto interno
        empleado = new EmpleadoPorComision3(nombre, apellido, nss, ventas, tarifa);
        establecerSalarioBase(salario);
    }

    // establece el salario base
    public void establecerSalarioBase(double salario)
    {
        salarioBase = (salario < 0.0) ? 0.0 : salario;
    }

    // devuelve el salario base
    public double obtenerSalarioBase()
    {
        return salarioBase;
    }

    // metodo que suma el salario base + ingresos del empleado interno
    public double ingresos()
    {
        return obtenerSalarioBase() + empleado.ingresos();
    }

    // devuelve representacion String del objeto
    public String toString()
    {
        return String.format(
            "%s %s\n%s: %.2f",
            "con sueldo base", empleado.toString(),
            "sueldo base", obtenerSalarioBase()
        );
    }

    // getters de los datos del empleado interno si los necesitas
    public EmpleadoPorComision3 obtenerEmpleado()
    {
        return empleado;
    }
}

