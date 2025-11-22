package cap8Foundational;

import java.awt.Point;

public class ShapeRunner {

	public static void main(String[] args) {
		
		Point p1 = new Point (3,5);
		
		Circle c1 = new Circle(p1, 2);
		
	    // Mostrar la dimensión
	    System.out.println("Dimension del circulo: " + c1.getDimension());

	    
	    int dimensiones[] = new int [2];

	    c1.setDimensions(dimensiones);

	    System.out.println(c1.toString());
	    
	 // rectangle 

		Point p2 = new Point (1,5);
		
		Rectangle r1 = new Rectangle(p1, 2, 3);
		
	    // Mostrar la dimensión
	    System.out.println("Dimensiones del rectangulo " + r1.getWidth() + " , " + r1.getHeight());

	    
	    int dimensionesR[] = new int [4];

	    c1.setDimensions(dimensionesR);

	    System.out.println(r1.toString());
	}

}
