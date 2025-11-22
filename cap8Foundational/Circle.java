package cap8Foundational;

import java.awt.Graphics;
import java.awt.Point;
import java.util.Arrays;

public class Circle extends OneDimensionalShape implements Drawable {

	  public Circle(Point location, int radius) {
	        super(location, radius);
	    }

	    @Override
	    public double getArea() {
	        return Math.PI * Math.pow(getDimension(), 2);
	    }

	    @Override
	    public void draw(Graphics g) {
	        int r = getDimension();
	        int x = location.x - r;
	        int y = location.y - r;
	        g.drawOval(x, y, 2*r, 2*r);
	    }
	
	
}
