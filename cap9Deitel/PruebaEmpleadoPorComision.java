package cap9Deitel;

public class PruebaEmpleadoPorComision {
	public static void main( String args[] )
    {
        // crea instancia de objeto EmpleadoPorComision
        EmpleadoPorComision empleado = new EmpleadoPorComision(
            "Sue", "Jones", "222-22-2222", 10000, .06 );

        // 1. Obtiene datos del empleado por comisión y los imprime
        System.out.println(
            "Informacion del empleado obtenida por los metodos establecer: \n" );
        System.out.printf( "%s %s\n", "El primer nombre es",
            empleado.obtenerPrimerNombre() );
        System.out.printf( "%s %s\n", "El apellido paterno es",
            empleado.obtenerApellidoPaterno() );
        System.out.printf( "%s %s\n", "El numero de seguro social es",
            empleado.obtenerNumeroSeguroSocial() );
        System.out.printf( "%s %.2f\n", "Las ventas brutas son",
            empleado.obtenerVentasBrutas() );
        System.out.printf( "%s %.2f\n", "La tarifa de comision es",
            empleado.obtenerTarifaComision() );
        
        // 2. Modifica los datos del objeto usando los métodos "establecer"
        empleado.establecerVentasBrutas( 500.00 ); // establece las ventas brutas
        empleado.establecerTarifaComision( .10 ); // establece la tarifa de comisión

        // 3. Imprime la información actualizada usando el método toString()
        System.out.printf( "\n%s:\n\n%s\n",
            "Informacion actualizada del empleado, obtenida mediante toString", empleado );
        
        // El cálculo de ingresos no se muestra aquí, pero se puede añadir:
        // System.out.printf( "\nIngresos: $%.2f\n", empleado.ingresos() );
    } // fin de main
}
