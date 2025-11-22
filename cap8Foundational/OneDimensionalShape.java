package cap8Foundational;

import java.awt.Point;

public abstract class OneDimensionalShape extends Shape{

 public OneDimensionalShape(Point location, int dimension) {
		        super(location);
		        int[] tempArray = {dimension};
		        setDimensions(tempArray);
		    }

	 public int getDimension()   {
		        return dimensions[0];
		    }

		    @Override
		    public void setDimensions(int[] dim){
		        if (dim.length == 1)
		        {
		            super.setDimensions(dim);
		        }
		    }
	}


	
	
	


