package cap8Deitel;

public class PruebaIncremento {
	public static void main( String args[] )
    {
        // Se asume que la clase Incremento (con final int INCREMENTO) está definida.
        
        // 1. Crea un objeto Incremento, estableciendo INCREMENTO en 5 (final).
        Incremento valor = new Incremento( 5 ); 

        // 2. Muestra el estado inicial del objeto.
        System.out.printf( "Antes de incrementar: %s\n\n", valor );

        // 3. Incrementa el total 3 veces, usando el valor constante INCREMENTO (5).
        for ( int i = 1; i <= 3; i++ )
        {
            valor.sumarIncrementoATotal();
            System.out.printf( "Después de incrementar %d: %s\n", i, valor );
        } // fin de for
    } // fin de main
}
