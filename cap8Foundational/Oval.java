package cap8Foundational;

import java.awt.Graphics;
import java.awt.Point;

public class Oval extends TwoDimensionalShape implements Drawable, Transformable, Rotatable  {

    public Oval(Point location, int height, int width)
    {
        super(location, height, width);
    }

    @Override
    public double getArea()
    {
        // Área = π * a * b  (a = semi-eje mayor, b = semi-eje menor)
        return Math.PI * 0.25 * getHeight() * getWidth();
    }

    @Override
    public void draw(Graphics g)
    {
        g.fillOval(getLocation().x, getLocation().y,
            getWidth(), getHeight());
    }

}
