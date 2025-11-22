package cap8Deitel;

import java.util.EnumSet;

public class PruebaEnum {
	public static void main( String args[] )
    {
        System.out.println( "Todos los libros:\n" );

        // imprime todos los libros en enum Libro
        // Libro.values() devuelve un array de todas las constantes en el orden de declaración.
        for ( Libro libro : Libro.values() )
            System.out.printf( "%-10s%-45s%s\n", libro,
                libro.obtenerTitulo(), libro.obtenerAnioCopyright() );

        System.out.println( "\nMostrar un rango de constantes enum:\n" );

        // imprime los primeros cuatro libros
        // EnumSet.range() devuelve un conjunto (Set) de constantes entre el inicio y el fin (ambos inclusive).
        for ( Libro libro : EnumSet.range( Libro.JHTP6, Libro.CPPHTP4 ) )
            System.out.printf( "%-10s%-45s%s\n", libro,
                libro.obtenerTitulo(), libro.obtenerAnioCopyright() );
    } // fin de main
}
