package cap9Deitel;

public class EmpleadoBaseMasComision5 extends EmpleadoPorComision4 {
	private double salarioBase; // salario base por semana

    // constructor con seis argumentos
    public EmpleadoBaseMasComision5( String nombre, String apellido,
        String nss, double ventas, double tarifa, double salario )
    {
        // 1. Llama implícita o explícitamente al constructor de la superclase (EmpleadoPorComision4)
        super( nombre, apellido, nss, ventas, tarifa );
        
        // 2. Ejecuta la lógica del constructor de la subclase
        establecerSalarioBase( salario ); // valida y almacena el salario base

        // Muestra cuándo se ejecuta este constructor (DEBE ser después del constructor de superclase)
        System.out.printf(
            "\nConstructor de EmpleadoBaseMasComision5:\n%s\n", this );
    } // fin del constructor de EmpleadoBaseMasComision5

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
    public double ingresos()
    {
        // Usa super.ingresos() para obtener la comisión calculada por la superclase
        return obtenerSalarioBase() + super.ingresos();
    } // fin del método ingresos

    // devuelve representación String de EmpleadoBaseMasComision5
    public String toString()
    {
        // Usa super.toString() para obtener la representación de la comisión
        return String.format( "%s %s\n%s: %.2f", "con sueldo base",
            super.toString(), "sueldo base", obtenerSalarioBase() );
    } // fin del método toString
}
