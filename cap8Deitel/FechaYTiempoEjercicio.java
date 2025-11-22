package cap8Deitel;

public class FechaYTiempoEjercicio {
	   private FechaEjercicio fecha;
	    private Tiempo2Ejercicio tiempo;

	    public FechaYTiempoEjercicio(int m, int d, int a, int h, int mm, int s) {
	        fecha = new FechaEjercicio(m,d,a);
	        tiempo = new Tiempo2Ejercicio(h,mm,s);
	    }

	    public void incrementarHora() {
	        boolean nuevoDia = tiempo.incrementarHora();
	        if (nuevoDia) fecha.siguienteDia();
	    }

	    public void tictac() {
	        int horaAntes = tiempo.obtenerHora();
	        tiempo.tictac();
	        if (tiempo.obtenerHora() < horaAntes)
	            fecha.siguienteDia();
	    }

	    public String aStringUniversal() {
	        return fecha.toString() + " " + tiempo.aStringUniversal();
	    }

	    public String toString() {
	        return fecha.toString() + " " + tiempo.toString();
	    }
}
