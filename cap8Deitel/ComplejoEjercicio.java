package cap8Deitel;

public class ComplejoEjercicio {
	 private double real;
	    private double imag;

	    public ComplejoEjercicio(double real, double imag) {
	        this.real = real;
	        this.imag = imag;
	    }

	    public ComplejoEjercicio() {
	        this.real = 0;
	        this.imag = 0;
	    }

	    public ComplejoEjercicio sumar(ComplejoEjercicio otro) {
	        return new ComplejoEjercicio(
	            this.real + otro.real,
	            this.imag + otro.imag
	        );
	    }

	    public ComplejoEjercicio restar(ComplejoEjercicio otro) {
	        return new ComplejoEjercicio(
	            this.real - otro.real,
	            this.imag - otro.imag
	        );
	    }

	    public void imprimir() {
	        System.out.println("(" + real + ", " + imag + ")");
	    }
}
