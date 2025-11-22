package cap9Deitel;

public class TestFiguras1 {

	  
		   public static void main(String[] args) {
		        // Simulación de creación de figuras
		        String paralelogramo = "Paralelogramo (base=5, altura=3)";
		        String rectangulo = "Rectángulo (base=4, altura=6)";
		        String cuadrado = "Cuadrado (lado=5)";
		        String trapezoide = "Trapezoide (baseMayor=6, baseMenor=4, altura=3)";

		        // Simulación de cálculo de áreas
		        double areaParalelogramo = 5 * 3;
		        double areaRectangulo = 4 * 6;
		        double areaCuadrado = 5 * 5;
		        double areaTrapezoide = (6 + 4) * 3 / 2;

		        // Mostrar resultados
		        System.out.println(paralelogramo + " -> Área: " + areaParalelogramo);
		        System.out.println(rectangulo + " -> Área: " + areaRectangulo);
		        System.out.println(cuadrado + " -> Área: " + areaCuadrado);
		        System.out.println(trapezoide + " -> Área: " + areaTrapezoide);
		    }
}
