package cap9Deitel;

public class PruebaConstructores {
	public static void main( String args[] )
    {
        // Crea una instancia de la clase base (Superclase)
        System.out.println( "Comprobando EmpleadoPorComision4:" );
        EmpleadoPorComision4 empleado1 = new EmpleadoPorComision4(
            "Bob", "Lewis", "333-33-3333", 5000.00, .04 );

        // Crea una instancia de la subclase (Subclase)
        System.out.println( "\nComprobando EmpleadoBaseMasComision5:" );
        EmpleadoBaseMasComision5 empleado2 =
            new EmpleadoBaseMasComision5(
                "Lisa", "Jones", "555-55-5555", 2000.00, .06, 800.00 );

        // Crea otra instancia de la subclase
        System.out.println( "\nComprobando EmpleadoBaseMasComision5:" );
        EmpleadoBaseMasComision5 empleado3 =
            new EmpleadoBaseMasComision5(
                "Mark", "Sands", "888-88-8888", 8000.00, .15, 2000.00 );
    } // fin de main
}
