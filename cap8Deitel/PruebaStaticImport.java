package cap8Deitel;
import static java.lang.Math.*;
public class PruebaStaticImport {
	public static void main( String args[] )
    {
        // Antes de static import, se requeriría: Math.sqrt(900.0), Math.ceil(-9.8), etc.
        System.out.printf( "sqrt( 900.0 ) = %.1f\n", sqrt( 900.0 ) );
        System.out.printf( "ceil( -9.8 ) = %.1f\n", ceil( -9.8 ) );
        // E es una constante static (miembro de campo static) importada.
        System.out.printf( "log( E ) = %.1f\n", log( E ) ); 
        System.out.printf( "cos( 0.0 ) = %.1f\n", cos( 0.0 ) );
    } // fin de main
}
