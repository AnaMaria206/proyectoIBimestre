package cap8Deitel;

public class RectanguloEjercicioPrueba {
	  public static void main(String[] args) {

	        RectanguloEjercicio r = new RectanguloEjercicio(
	            1,1,   // esquina 1
	            5,1,   // esquina 2
	            5,4,   // esquina 3
	            1,4    // esquina 4
	        );

	        System.out.println("Longitud: " + r.obtenerLongitud());
	        System.out.println("Anchura: " + r.obtenerAnchura());
	        System.out.println("Perimetro: " + r.obtenerPerimetro());
	        System.out.println("Area: " + r.obtenerArea());
	        System.out.println("Es cuadrado?: " + r.esCuadrado());
	    }
	
}
