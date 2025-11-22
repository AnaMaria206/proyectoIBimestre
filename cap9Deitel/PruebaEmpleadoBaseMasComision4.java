package cap9Deitel;

public class PruebaEmpleadoBaseMasComision4 {
	public static void main( String args[] )
    {
        // crea instancia de un objeto EmpleadoBaseMasComision4
        EmpleadoBaseMasComision4 empleado =
            new EmpleadoBaseMasComision4(
                "Bob", "Lewis", "333-33-3333", 5000.00, .04, 300.00 );

        // Obtiene datos del empleado por comisión con sueldo base
        System.out.println(
            "Informacion del empleado obtenida por los metodos obtener: \n" );
        
        // La mayoría de los métodos obtener son heredados de EmpleadoPorComision3
        System.out.printf( "%s %s\n", "El primer nombre es",
            empleado.obtenerPrimerNombre() );
        System.out.printf( "%s %s\n", "El apellido es",
            empleado.obtenerApellidoPaterno() );
        System.out.printf( "%s %s\n", "El numero de seguro social es",
            empleado.obtenerNumeroSeguroSocial() );
        System.out.printf( "%s %.2f\n", "Las ventas brutas son",
            empleado.obtenerVentasBrutas() );
        System.out.printf( "%s %.2f\n", "La tarifa de comision es",
            empleado.obtenerTarifaComision() );
        
        // Este método es propio de EmpleadoBaseMasComision4
        System.out.printf( "%s %.2f\n", "El salario base es",
            empleado.obtenerSalarioBase() );

        // Modifica el salario base
        empleado.establecerSalarioBase( 1000.00 ); 

        // Imprime la información actualizada usando toString(), el cual usa super.toString()
        System.out.printf( "\n%s:\n\n%s\n",
            "Informacion actualizada del empleado, obtenida por toString",
            empleado.toString() );
            
        // Llama al método ingresos(), el cual usa super.ingresos()
        System.out.printf( "\nIngresos totales: %.2f\n", empleado.ingresos() );
    } // fin de main
}
