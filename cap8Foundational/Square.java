package cap8Foundational;

import java.awt.Graphics;
import java.awt.Point;

public class Square extends OneDimensionalShape implements Drawable {

    public Square(Point location, int size)
    {
        super(location, size);
    }

    @Override
    public double getArea()
    {
        return Math.pow(getDimension(), 2);
    }

    @Override
    public void draw(Graphics g)
    {
        g.fillRect(getLocation().x, getLocation().y,
            getDimension(), getDimension());
    }
}