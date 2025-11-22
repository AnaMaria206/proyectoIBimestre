package cap9Deitel;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import cap8Deitel.PanelDibujo;

public class PruebaPanelDibujo {
	   public static void main(String[] args) {

	        PanelDibujo panel = new PanelDibujo();
	        JLabel barraEstado = new JLabel(panel.getEstado());

	        JFrame aplicacion = new JFrame();

	        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        aplicacion.add(panel, BorderLayout.CENTER);
	        aplicacion.add(barraEstado, BorderLayout.SOUTH);

	        aplicacion.setSize(300, 300);
	        aplicacion.setVisible(true);
	    }
}
