package cap8Deitel;

public class PruebaTiempo {
	public static void main( String args[] )
    {
        // crea e inicializa un objeto Tiempo1
        Tiempo1 tiempo = new Tiempo1(); // invoca el constructor de Tiempo1

        // imprime representaciones de cadena del tiempo
        System.out.print( "La hora universal inicial es: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "La hora estandar inicial es: " );
        System.out.println( tiempo.toString() );
        System.out.println(); // imprime una línea en blanco

        // modifica el tiempo e imprime el tiempo actualizado
        tiempo.establecerTiempo( 13, 27, 6 );
        System.out.print( "La hora universal despues de establecerTiempo es: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "La hora estandar despues de establecerTiempo es: " );
        System.out.println( tiempo.toString() );
        System.out.println(); // imprime una línea en blanco

        // establece el tiempo con valores inválidos; imprime el tiempo actualizado
        tiempo.establecerTiempo( 99, 99, 99 );
        System.out.println( "Despues de intentar ajustes invalidos:" );
        System.out.print( "Hora universal: " );
        System.out.println( tiempo.aStringUniversal() );
        System.out.print( "Hora estandar: " );
        System.out.println( tiempo.toString() );
    } // fin de main
}
