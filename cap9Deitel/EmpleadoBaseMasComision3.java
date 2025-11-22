package cap9Deitel;

public class EmpleadoBaseMasComision3 extends EmpleadoPorComision2 {
    private double salarioBase; // salario base por semana

    // constructor con seis argumentos
    public EmpleadoBaseMasComision3( String nombre, String apellido,
        String nss, double ventas, double tarifa, double salario )
    {
        
        super( nombre, apellido, nss, ventas, tarifa );
        
        establecerSalarioBase( salario ); // valida y almacena el salario base
    } // fin del constructor de EmpleadoBaseMasComision3

    // establece el salario base
    public void establecerSalarioBase( double salario )
    {
        salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
    } // fin del método establecerSalarioBase

    // devuelve el salario base
    public double obtenerSalarioBase()
    {
        return salarioBase;
    } // fin del método obtenerSalarioBase

    // calcula los ingresos (Sobreescribe el método ingresos de la superclase)
    // Funciona porque las variables de la superclase son 'protected'.
    public double ingresos()
    {
        return salarioBase + ( tarifaComision * ventasBrutas );
    } // fin del método ingresos

    // devuelve representación String de EmpleadoBaseMasComision3
    // Funciona porque las variables de la superclase son 'protected'.
    public String toString()
    {
        return String.format(
            "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
            "empleado por comision con salario base", primerNombre, apellidoPaterno,
            "numero de seguro social", numeroSeguroSocial,
            "ventas brutas", ventasBrutas, "tarifa comision", tarifaComision,
            "salario base", salarioBase );
    } // fin del método toString
} // fin de la clase EmpleadoBaseMasComision3