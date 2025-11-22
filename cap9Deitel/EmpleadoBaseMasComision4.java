package cap9Deitel;

public class EmpleadoBaseMasComision4 extends EmpleadoPorComision3{

	private double salarioBase; // salario base por semana

    // constructor con seis argumentos
    public EmpleadoBaseMasComision4( String nombre, String apellido,
        String nss, double ventas, double tarifa, double salario )
    {
        // Llama al constructor de la superclase (EmpleadoPorComision3)
        super( nombre, apellido, nss, ventas, tarifa );
        
        establecerSalarioBase( salario ); // valida y almacena el salario base
    } // fin del constructor de EmpleadoBaseMasComision4

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

    // calcula los ingresos
    // Sobrescribe el método ingresos, usando super.ingresos() para reutilizar el cálculo de la comisión.
    public double ingresos()
    {
        return obtenerSalarioBase() + super.ingresos();
    } // fin del método ingresos

    // devuelve representación String de EmpleadoBaseMasComision4
    // Usa super.toString() para obtener la representación de la comisión y luego añade el salario base.
    public String toString()
    {
        return String.format( "%s %s\n%s: %.2f", "con sueldo base",
            super.toString(), "sueldo base", obtenerSalarioBase() );
    } // fin del método toString
	
}
