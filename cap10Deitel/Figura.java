package cap10Deitel;

public abstract class Figura {
	   public abstract String descripcion();
	}

	// Figura bidimensional
	abstract class FiguraBidimensional extends Figura {
	    public abstract double obtenerArea();
	}

	// Figura tridimensional
	abstract class FiguraTridimensional extends Figura {
	    public abstract double obtenerArea();
	    public abstract double obtenerVolumen();
	}


