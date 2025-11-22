package cap8Foundational;

import java.awt.Graphics;
import java.awt.Point;

public class EquilateralTriangle extends OneDimensionalShape implements Drawable {

    public EquilateralTriangle(Point location, int side) {
        super(location, side);
    }

    public int getSide() {
        return getDimension();
    }

    @Override
    public double getArea() {
        int side = getSide();
        return (Math.sqrt(3) / 4.0) * side * side;
    }

    @Override
    public void draw(Graphics g) {
        int side = getSide();
        int x = location.x;
        int y = location.y;

        // Altura del triángulo equilátero
        int height = (int) (Math.sqrt(3) / 2 * side);

        // Coordenadas de los tres vértices
        int[] xPoints = { x, x + side, x + side / 2 };
        int[] yPoints = { y, y, y - height };

        g.fillPolygon(xPoints, yPoints, 3);
    }

    @Override
    public String toString() {
        return "EquilateralTriangle [location=" + location +
               ", side=" + getSide() + "]";
    }
}
