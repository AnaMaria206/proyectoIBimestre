package cap8Deitel;

import javax.swing.JFrame;

public class PruebaDibujo {
	public static void main( String args[] )
    {
        // Se asume que PanelDibujo y MiLinea están definidas y accesibles.

        // 1. Crea una instancia del panel que contiene las líneas aleatorias.
        PanelDibujo panel = new PanelDibujo(); 
        
        // 2. Crea la ventana principal (el marco de la aplicación).
        JFrame aplicacion = new JFrame();

        // 3. Configura la ventana.
        // Cierra la aplicación cuando se pulsa el botón de cerrar.
        aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
        
        // Añade el panel de dibujo a la ventana.
        aplicacion.add( panel ); 
        
        // Establece el tamaño de la ventana (300x300 píxeles).
        aplicacion.setSize( 300, 300 );
        
        // Hace que la ventana sea visible.
        aplicacion.setVisible( true ); 
    } // fin de main
}
