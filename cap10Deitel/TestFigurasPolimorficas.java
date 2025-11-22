package cap10Deitel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestFigurasPolimorficas {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Número de figuras a generar:");
        int numFiguras = Integer.parseInt(input);

        JFrame ventana = new JFrame("Dibujo Polimórfico de Figuras");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);
        ventana.add(new PanelDibujo(numFiguras));
        ventana.setVisible(true);
    }
}
