package cap10Deitel;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class PanelDibujo extends JPanel {
    private MiFigura[] figuras;
    private Random rand = new Random();

    public PanelDibujo(int numFiguras) {
        figuras = new MiFigura[numFiguras];
        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(3); // 0=Linea, 1=Rectangulo, 2=Ovalo
            int x1 = rand.nextInt(300), y1 = rand.nextInt(300);
            int x2 = rand.nextInt(300), y2 = rand.nextInt(300);
            switch(tipo) {
                case 0: figuras[i] = new MiLinea(x1, y1, x2, y2, Color.BLACK); break;
                case 1: figuras[i] = new MiRectangulo(x1, y1, x2, y2, Color.RED, rand.nextBoolean()); break;
                case 2: figuras[i] = new MiOvalo(x1, y1, x2, y2, Color.BLUE, rand.nextBoolean()); break;
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (MiFigura f : figuras) {
            f.dibujar(g);
        }
    }
}