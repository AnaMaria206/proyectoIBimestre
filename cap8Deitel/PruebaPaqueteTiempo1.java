package cap8Deitel;

public class PruebaPaqueteTiempo1 {
	public static void main( String args[] )
    {
        // crea e inicializa un objeto Tiempo1
        Tiempo1 tiempo = new Tiempo1(); // llama al constructor de Tiempo1 (00:00:00)

        // imprime representaciones String de la hora
        System.out.print( "La hora universal inicial es: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "La hora estandar inicial es: " );
        System.out.println( tiempo.toString() );
        System.out.println(); // imprime una línea en blanco

        // cambia la hora e imprime la hora actualizada
        tiempo.establecerTiempo( 13, 27, 6 ); // Establece 13:27:06 (1:27:06 PM)
        System.out.print( "La hora universal despues de establecerTiempo es: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "La hora estandar despues de establecerTiempo es: " );
        System.out.println( tiempo.toString() );
        System.out.println(); // imprime una línea en blanco

        // establece la hora con valores inválidos; imprime la hora actualizada
        tiempo.establecerTiempo( 99, 99, 99 ); // Todos los valores inválidos se convierten a 0
        System.out.println( "Despues de intentar ajustes invalidos:" );
        System.out.print( "Hora universal: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "Hora estandar: " );
        System.out.println( tiempo.toString() );
    } // fin de main
}
