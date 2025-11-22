package cap8Deitel;

public enum LuzSemaforoEjercicio {
	 ROJO(30),
	    VERDE(45),
	    AMARILLO(5);

	    private int duracion;

	    LuzSemaforoEjercicio(int duracion) {
	        this.duracion = duracion;
	    }

	    public int getDuracion() {
	        return duracion;
	    }
}
