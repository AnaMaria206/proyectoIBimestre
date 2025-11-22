package cap8Deitel;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
public class PanelDibujo extends JPanel{
	private Random numerosAleatorios = new Random();
    private MiLinea lineas[]; // arreglo de lineas

    // constructor, crea un panel con figuras al azar
    public PanelDibujo()
    {
        setBackground( Color.WHITE );

        // Crea un arreglo con una longitud aleatoria entre 5 y 9 (5 + 0 a 4)
        lineas = new MiLinea[ 5 + numerosAleatorios.nextInt( 5 ) ];

        // crea lineas
        for ( int cuenta = 0; cuenta < lineas.length; cuenta++ )
        {
            // genera coordenadas aleatorias dentro de un rango de 300
            int x1 = numerosAleatorios.nextInt( 300 );
            int y1 = numerosAleatorios.nextInt( 300 );
            int x2 = numerosAleatorios.nextInt( 300 );
            int y2 = numerosAleatorios.nextInt( 300 );

            // genera un color aleatorio (valores de 0 a 255 para RGB)
            Color color = new Color( numerosAleatorios.nextInt( 256 ),
                numerosAleatorios.nextInt( 256 ), numerosAleatorios.nextInt( 256 ) );

            // agrega la línea a la lista de líneas a mostrar en pantalla
            // Se utiliza el constructor de MiLinea para encapsular los datos.
            lineas[ cuenta ] = new MiLinea( x1, y1, x2, y2, color );
        } // fin de for
    } // fin del constructor de PanelDibujo

    // para cada arreglo de figuras, dibuja las figuras individuales
    public void paintComponent( Graphics g )
    {
        super.paintComponent( g );

        // dibuja las líneas
        // Se itera sobre el arreglo y se le pide a cada objeto MiLinea que se dibuje.
        for ( MiLinea linea : lineas )
            linea.dibujar( g );
    } // fin del método paintComponent
    public String getEstado() {
        return "Lineas: " + lineas.length;
    }

}
