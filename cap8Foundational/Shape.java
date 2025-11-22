package cap8Foundational;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Shape {
	  protected Point location;
	    protected int[] dimensions;

	    public Shape(Point location) {
	        setLocation(location);
	    }

	    public int[] getDimensions() {
	        return dimensions;
	    }

	    public void setDimensions(int[] dim) {
	        this.dimensions = dim;
	    }

	    public Point getLocation() {
	        return location;
	    }

	    public void setLocation(Point location) {
	        this.location = location;
	    }

	    public abstract double getArea();
}
