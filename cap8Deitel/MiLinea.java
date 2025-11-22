package cap8Deitel;

import java.awt.Color;
import java.awt.Graphics;

public class MiLinea {
	private int x1; // coordenada x del primer punto final
    private int y1; // coordenada y del primer punto final
    private int x2; // coordenada x del segundo punto final
    private int y2; // coordenada y del segundo punto final
    private Color miColor; // el color de esta figura

    // constructor con valores de entrada
    public MiLinea( int x1, int y1, int x2, int y2, Color color )
    {
        this.x1 = x1; // establece la coordenada x del primer punto final
        this.y1 = y1; // establece la coordenada y del primer punto final
        this.x2 = x2; // establece la coordenada x del segundo punto final
        this.y2 = y2; // establece la coordenada y del segundo punto final
        miColor = color; // establece el color
    } // fin del constructor de MiLinea

    // Dibuja la línea en el color específico
    public void dibujar( Graphics g )
    {
        g.setColor( miColor );
        g.drawLine( x1, y1, x2, y2 );
    } // fin del método dibujar
}
