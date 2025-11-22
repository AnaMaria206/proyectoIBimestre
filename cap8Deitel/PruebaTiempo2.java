package cap8Deitel;

public class PruebaTiempo2 {

	public static void main(String[] args) {
		// Se asume que la clase Tiempo2 está definida y accesible.

        // Crea 6 objetos Tiempo2 utilizando diferentes constructores:
        Tiempo2 t1 = new Tiempo2();               // 00:00:00 (Sin argumentos)
        Tiempo2 t2 = new Tiempo2( 2 );            // 02:00:00 (Solo hora)
        Tiempo2 t3 = new Tiempo2( 21, 34 );       // 21:34:00 (Hora y minuto)
        Tiempo2 t4 = new Tiempo2( 12, 25, 42 );   // 12:25:42 (Hora, minuto y segundo)
        Tiempo2 t5 = new Tiempo2( 27, 74, 99 );   // 00:00:00 (Valores inválidos, se establecen a cero)
       

        // Muestra las representaciones de cadena de cada objeto.
        System.out.println( "Se construyo con:" );
        
        System.out.println( "t1: todos los argumentos predeterminados" );
        System.out.printf( " %s\n%s\n", t1.aStringUniversal(), t1.toString() );
        
        System.out.println( "t2: se especifico hora; minuto y segundo predeterminados" );
        System.out.printf( " %s\n%s\n", t2.aStringUniversal(), t2.toString() );
        
        System.out.println( "t3: se especificaron hora y minuto; segundo predeterminado" );
        System.out.printf( " %s\n%s\n", t3.aStringUniversal(), t3.toString() );
        
        System.out.println( "t4: se especificaron hora, minuto y segundo" );
        System.out.printf( " %s\n%s\n", t4.aStringUniversal(), t4.toString() );
        
        System.out.println( "t5: se especificaron todos los valores invalidos" );
        System.out.printf( " %s\n%s\n", t5.aStringUniversal(), t5.toString() );
        
        System.out.println( "t6: se especifico el objeto t4 de Tiempo2" );

    
	}

}
