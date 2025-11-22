package cap8Foundational;

import java.awt.Point;

public abstract class TwoDimensionalShape extends Shape implements Transformable, Rotatable{

	public TwoDimensionalShape (Point location,
	        int dimension1, int dimension2)
	    {
	        super(location);
	        int[] tempArray = {dimension1, dimension2};
	        setDimensions(tempArray);
	    }

	    public int getHeight()
	    {
	        return dimensions[0];
	    }

	    public int getWidth()
	    {
	        return dimensions[1];
	    }

	    @Override
	    public void setDimensions(int[] dim)
	    {
	        if (dim.length == 2) {
	            super.setDimensions(dim);
	        }
	    }
	    
	    public void switchDimensions ()  {
	    	int temp = dimensions [0];
	    	dimensions [0] = dimensions [1];
	    	dimensions [1] = temp;
	    }
	    @Override
	    public void rotate() { 
	
	        int temp = dimensions[0];
	        dimensions[0] = dimensions[1];
	        dimensions[1] = temp;
	    }

	    @Override
	    public void rotate180() { 
	 
	        rotate();
	        rotate();
	    }

	    @Override
	    public void rotate270() { 
	
	        rotate180();
	        rotate();
	    }

	    @Override
	    public void rotateCounterclockwise() { 
	   
	        rotate270();
	    }

		@Override
		public void resizeBy(double scaleFactor)
		{
		    int height = getHeight();
		    int width = getWidth();
		    setDimensions(new int[] {height *= scaleFactor,
		        width *= scaleFactor});
		}
		@Override
		public double getArea() {

			return 0;
		}
	    
	    
	
}
