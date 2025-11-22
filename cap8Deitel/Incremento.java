package cap8Deitel;

public class Incremento {
	private int total = 0; // el total de todos los incrementos
    private final int INCREMENTO; // variable constante (sin inicializar)

    // el constructor inicializa la variable de instancia final INCREMENTO
    public Incremento( int valorIncremento )
    {
        // NOTA: Una variable de instancia 'final' DEBE ser inicializada
        // en su declaración O en el constructor de la clase.
        INCREMENTO = valorIncremento; // inicializa la variable constante (una vez)
    } // fin del constructor de Incremento

    // suma INCREMENTO al total
    public void sumarIncrementoATotal()
    {
        total += INCREMENTO;
    } // fin del método sumarIncrementoATotal

    // devuelve representación String de los datos de un objeto Incremento
    public String toString()
    {
        return String.format( "total = %d", total );
    } // fin del método toString
}
