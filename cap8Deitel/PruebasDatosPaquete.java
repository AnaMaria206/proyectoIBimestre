package cap8Deitel;

public class PruebasDatosPaquete {
	public static void main( String args[] )
    {
        DatosPaquete datosPaquete = new DatosPaquete();

        // imprime la representación String de datosPaquete
        System.out.printf( "Despues de instanciar:\n%s\n", datosPaquete );

        // modifica los datos con acceso a nivel de paquete en el objeto datosPaquete
        // NOTA: No hay prefijo de acceso (public, private, protected), por lo que es de paquete.
        datosPaquete.numero = 77;
        datosPaquete.cadena = "Adios";

        // imprime la representación String de datosPaquete
        System.out.printf( "\nDespues de modificar valores:\n%s\n", datosPaquete );
    } // fin de main
} // fin de la clase PruebaDatosPaquete

// Clase con variables de instancia con acceso a nivel de paquete
class DatosPaquete
{
    int numero;     // variable de instancia con acceso a nivel de paquete
    String cadena;  // variable de instancia con acceso a nivel de paquete

    // constructor
    public DatosPaquete()
    {
        numero = 0;
        cadena = "Hola";
    } // fin del constructor de DatosPaquete

    // devuelve la representación String del objeto DatosPaquete
    public String toString()
    {
        // Se asume que el método toString() se completa así:
        return String.format( "numero: %d, cadena: %s", numero, cadena );
    } // fin del método toString
}
