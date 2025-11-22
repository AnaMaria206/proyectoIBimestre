package cap8Foundational;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;

public class DrawFrame extends JFrame {

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        Drawable[] shapes = {
            new Square(new Point(70,70), 70),
            new Rectangle(new Point(50,150), 25, 50),
            new Oval(new Point(100,220), 50,30),
            new Circle(new Point(175,100), 100),
            new RoundedRectangle(new Point(110,160), 40, 60, 20),
            new RightAngleTriangle(new Point(180, 210), 100, 50),
            new EquilateralTriangle(new Point(260, 250), 80)
        };

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw(g);
        }
    }

    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame();
        frame.setTitle("Lots of shapes...");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
