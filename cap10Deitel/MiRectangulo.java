package cap10Deitel;

import java.awt.Color;
import java.awt.Graphics;

public class MiRectangulo extends MiFiguraDelimitada {
    public MiRectangulo() { super(); }
    public MiRectangulo(int x1, int y1, int x2, int y2, Color color, boolean relleno) {
        super(x1, y1, x2, y2, color, relleno);
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(getColor());
        if (isRelleno()) {
            g.fillRect(getXSuperiorIzquierda(), getYSuperiorIzquierda(), getAncho(), getAlto());
        } else {
            g.drawRect(getXSuperiorIzquierda(), getYSuperiorIzquierda(), getAncho(), getAlto());
        }
    }
}
