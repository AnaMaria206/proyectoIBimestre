package cap9Deitel;

public class PruebaEmpleadoBaseMasComision3 {
	public static void main( String args[] )
    {
        // crea instancia de un objeto EmpleadoBaseMasComision3
        // El constructor utiliza la llamada 'super' para inicializar los campos heredados.
        EmpleadoBaseMasComision3 empleado =
            new EmpleadoBaseMasComision3(
                "Bob", "Lewis", "333-33-3333", 5000.00, .04, 300.00 );

        // Obtiene datos del empleado por comision con sueldo base
        System.out.println(
            "Informacion del empleado, obtenida por los metodos obtener: \n" );
        
        // Los métodos obtener...() son heredados de EmpleadoPorComision2
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
        
        // Este método es propio de EmpleadoBaseMasComision3
        System.out.printf( "%s %.2f\n", "El salario base es",
            empleado.obtenerSalarioBase() );

        // Modifica el salario base (método propio de la subclase)
        empleado.establecerSalarioBase( 1000.00 );

        // Imprime la información actualizada usando toString(), que usa los campos 'protected'
        System.out.printf( "\n%s:\n\n%s\n",
            "Informacion actualizada del empleado, obtenida por toString",
            empleado.toString() );
            
        // Llama al método ingresos() sobrescrito (override)
        System.out.printf( "\nIngresos totales: %.2f\n", empleado.ingresos() );
    } // fin de main
}
