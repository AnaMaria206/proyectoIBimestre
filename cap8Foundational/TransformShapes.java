package cap8Foundational;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;

public class TransformShapes extends JFrame {

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Ahora deben implementarse como Drawable Y Transformable
        Drawable[] shapes = {
            new Rectangle(new Point(50, 150), 25, 50),
            new Oval(new Point(100, 220), 50, 30),
            new RoundedRectangle(new Point(110, 160), 40, 60, 20),
            new RightAngleTriangle(new Point(180, 210), 100, 50)
        };

        Transformable[] transforms = new Transformable[shapes.length];

        // Convertimos cada shape a Transformable si lo implementa
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Transformable) {
                transforms[i] = (Transformable) shapes[i];
            }
        }

        for (int i = 0; i < shapes.length; i++) {
            g.setColor(Color.GRAY);
            shapes[i].draw(g);

            if (transforms[i] != null) {
                transforms[i].switchDimensions();
            }

            g.setColor(Color.DARK_GRAY);
            shapes[i].draw(g);
        }
    }

    public static void main(String[] args) {
        TransformShapes frame = new TransformShapes();
        frame.setTitle("Shapes transformed");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
