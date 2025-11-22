package cap8Deitel;

public enum Libro {
	// declara constantes de tipo enum
    JHTP6( "Java How to Program 6e", "2005" ),
    CHTP4( "C How to Program 4e", "2004" ),
    IW3HTP3( "Internet & World Wide Web How to Program 3e", "2004" ),
    CPPHTP4( "C++ How to Program 4e", "2003" ),
    VBHTP2( "Visual Basic .NET How to Program 2e", "2002" ),
    CSHARPHTP( "C# How to Program", "2002" );

    // campos de instancia
    private final String titulo; // título del libro
    private final String anioCopyright; // año de copyright

    // constructor de enum (implícitamente private o package-private)
    Libro( String tituloLibro, String anio )
    {
        titulo = tituloLibro;
        anioCopyright = anio;
    } // fin de constructor de enum Libro

    // método de acceso para el campo titulo
    public String obtenerTitulo()
    {
        return titulo;
    } // fin del método obtenerTitulo

    // método de acceso para el campo anioCopyright
    public String obtenerAnioCopyright()
    {
        return anioCopyright;
    } // fin del método obtenerAnioCopyright
}
