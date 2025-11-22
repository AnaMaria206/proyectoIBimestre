package cap8Foundational;

import java.awt.Graphics;
import java.awt.Point;

public class RightAngleTriangle extends TwoDimensionalShape 
        implements Drawable, Transformable, Rotatable {
    
    public RightAngleTriangle(Point location, int height, int width)
    {
        super(location, height, width);
    }

    @Override
    public double getArea()
    {
        return (getHeight() * getWidth()) / 2.0;
    }

    @Override
    public void draw(Graphics g)
    {
        int x = getLocation().x;
        int y = getLocation().y;

        int[] xValues = {
            x,
            x,
            x + getWidth()
        };

        int[] yValues = {
            y,
            y + getHeight(),
            y + getHeight()
        };

        g.fillPolygon(xValues, yValues, 3);
    }

}
