package cap10Deitel;

import java.awt.Color;
import java.awt.Graphics;

public abstract class MiFiguraDelimitada extends MiFigura {
    private boolean relleno;

    public MiFiguraDelimitada() {
        super();
        this.relleno = false;
    }

    public MiFiguraDelimitada(int x1, int y1, int x2, int y2, Color color, boolean relleno) {
        super(x1, y1, x2, y2, color);
        this.relleno = relleno;
    }

    public boolean isRelleno() { return relleno; }
    public void setRelleno(boolean relleno) { this.relleno = relleno; }

    public int getXSuperiorIzquierda() { return Math.min(getX1(), getX2()); }
    public int getYSuperiorIzquierda() { return Math.min(getY1(), getY2()); }
    public int getAncho() { return Math.abs(getX2() - getX1()); }
    public int getAlto() { return Math.abs(getY2() - getY1()); }
}