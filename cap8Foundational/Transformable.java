package cap8Foundational;

import java.util.Arrays;

public interface Transformable {

	void switchDimensions();
	
	default public void resizeBy (double scaleFactor) { 
		System.err.println("Override this method to provide resizing behavior");
		
	}
	public static boolean isTransformable(Shape s) 
    {
        boolean isTransformable = false;
        
        // El Arrays.toString() convierte el array de interfaces a un String para la búsqueda.
        String interfaces =
            Arrays.toString(s.getClass().getInterfaces());
            
        if (interfaces.contains("Transformable"))
        {
            isTransformable = true;
        }
        
        return isTransformable;
    }
}
