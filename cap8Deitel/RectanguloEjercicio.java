package cap8Deitel;

public class RectanguloEjercicio {
	 private double x1, y1;
	    private double x2, y2;
	    private double x3, y3;
	    private double x4, y4;

	    public RectanguloEjercicio(double x1, double y1,
	                               double x2, double y2,
	                               double x3, double y3,
	                               double x4, double y4) {
	        establecer(x1, y1, x2, y2, x3, y3, x4, y4);
	    }

	    public void establecer(double x1, double y1,
	                           double x2, double y2,
	                           double x3, double y3,
	                           double x4, double y4) {

	        if (!coordenadasValidas(x1,y1) || !coordenadasValidas(x2,y2) ||
	            !coordenadasValidas(x3,y3) || !coordenadasValidas(x4,y4)) {

	            System.out.println("Coordenadas fuera del rango permitido (1er cuadrante, max 20).");
	            return;
	        }

	        if (!esRectangulo(x1, y1, x2, y2, x3, y3, x4, y4)) {
	            System.out.println("Las coordenadas no forman un rectangulo.");
	            return;
	        }

	        this.x1 = x1; this.y1 = y1;
	        this.x2 = x2; this.y2 = y2;
	        this.x3 = x3; this.y3 = y3;
	        this.x4 = x4; this.y4 = y4;
	    }

	    private boolean coordenadasValidas(double x, double y) {
	        return x >= 0 && x <= 20 && y >= 0 && y <= 20;
	    }

	    private double distancia(double x1, double y1, double x2, double y2) {
	        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	    }

	    private boolean esRectangulo(double a1, double b1,
	                                 double a2, double b2,
	                                 double a3, double b3,
	                                 double a4, double b4) {

	        double d12 = distancia(a1,b1,a2,b2);
	        double d23 = distancia(a2,b2,a3,b3);
	        double d34 = distancia(a3,b3,a4,b4);
	        double d41 = distancia(a4,b4,a1,b1);

	        double diag1 = distancia(a1,b1,a3,b3);
	        double diag2 = distancia(a2,b2,a4,b4);

	        return d12 > 0 && d23 > 0 && d34 > 0 && d41 > 0 && diag1 == diag2;
	    }

	    public double obtenerLongitud() {
	        double lado1 = distancia(x1,y1,x2,y2);
	        double lado2 = distancia(x2,y2,x3,y3);
	        return Math.max(lado1, lado2);
	    }

	    public double obtenerAnchura() {
	        double lado1 = distancia(x1,y1,x2,y2);
	        double lado2 = distancia(x2,y2,x3,y3);
	        return Math.min(lado1, lado2);
	    }

	    public double obtenerPerimetro() {
	        return 2 * (obtenerLongitud() + obtenerAnchura());
	    }

	    public double obtenerArea() {
	        return obtenerLongitud() * obtenerAnchura();
	    }

	    public boolean esCuadrado() {
	        return Math.abs(obtenerLongitud() - obtenerAnchura()) < 0.0001;
	    }
}
