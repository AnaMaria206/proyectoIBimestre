package cap8Deitel;

public class PruebaLuzSemaforoEjercicio {

	public static void main(String[] args) {
		  for (LuzSemaforoEjercicio luz : LuzSemaforoEjercicio.values()) {
	            System.out.println(luz + " dura " + luz.getDuracion() + " segundos");
	        }
	}

}
