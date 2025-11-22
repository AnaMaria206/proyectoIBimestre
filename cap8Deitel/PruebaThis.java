package cap8Deitel;

public class PruebaThis {
	public static void main( String args[] )
    {
        TiempoSimple tiempo = new TiempoSimple( 15, 30, 19 );
        System.out.println( tiempo.crearString() );
    } // fin de main
} // fin de la clase PruebaThis

// la clase TiempoSimple demuestra la referencia "this"
class TiempoSimple
{
    private int hora;    // 0-23
    private int minuto;  // 0-59
    private int segundo; // 0-59

    // si el constructor utiliza nombres de parámetros idénticos a
    // los nombres de las variables de instancia, se requiere la
    // referencia "this" para diferenciar unos nombres de otros
    public TiempoSimple( int hora, int minuto, int segundo )
    {
        this.hora = hora;    // establece la hora del objeto "this"
        this.minuto = minuto;  // establece el minuto del objeto "this"
        this.segundo = segundo; // establece el segundo del objeto "this"
    } // fin del constructor de TiempoSimple

    // usa la referencia "this" explícita e implícita para llamar a aStringUniversal
    public String crearString()
    {
        return String.format( "%24s: %s\n%24s: %s",
            "this.aStringUniversal()", this.aStringUniversal(),
            "aStringUniversal()", aStringUniversal() );
    } // fin del método crearString

    // convierte a String en formato de hora universal (HH:MM:SS)
    public String aStringUniversal()
    {
        // "this" no se requiere aquí para acceder a las variables de instancia,
        // ya que el método no tiene variables locales con los mismos
        // nombres que las variables de instancia
        return String.format( "%02d:%02d:%02d",
            this.hora, this.minuto, this.segundo );
    } // fin del método aStringUniversal
}
