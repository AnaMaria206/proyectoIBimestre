package cap10Deitel;

import java.awt.Color;
import java.awt.Graphics;

public class MiOvalo extends MiFiguraDelimitada {
    public MiOvalo() { super(); }
    public MiOvalo(int x1, int y1, int x2, int y2, Color color, boolean relleno) {
        super(x1, y1, x2, y2, color, relleno);
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(getColor());
        if (isRelleno()) {
            g.fillOval(getXSuperiorIzquierda(), getYSuperiorIzquierda(), getAncho(), getAlto());
        } else {
            g.drawOval(getXSuperiorIzquierda(), getYSuperiorIzquierda(), getAncho(), getAlto());
        }
    }
}
