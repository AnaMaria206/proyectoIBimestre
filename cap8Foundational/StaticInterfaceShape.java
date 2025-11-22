package cap8Foundational;

import java.awt.Point;

public class StaticInterfaceShape {
	public static void main(String[] args)
    {
        OneDimensionalShape mySquare =
            new Square(new Point(100, 100), 10);
        TwoDimensionalShape myRectangle =
            new Rectangle(new Point(200, 200), 10, 8);
        
        System.out.println("Square is transformable: " +
            Transformable.isTransformable(mySquare));
        System.out.println("Rectangle is transformable: " +
            Transformable.isTransformable(myRectangle));
    }
}
