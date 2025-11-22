package cap10Deitel;

public class Factura  implements Pagar {
	   private String numeroPieza;
	    private String descripcion;
	    private int cantidad;
	    private double precioPorArticulo;

	    public Factura(String numeroPieza, String descripcion, int cantidad, double precioPorArticulo) {
	        this.numeroPieza = numeroPieza;
	        this.descripcion = descripcion;
	        this.cantidad = cantidad;
	        this.precioPorArticulo = precioPorArticulo;
	    }

	    @Override
	    public double obtenerMontoPago() { return cantidad * precioPorArticulo; }

	    @Override
	    public String toString() {
	        return String.format("Factura:\nNúmero pieza: %s\nDescripción: %s\nCantidad: %d\nPrecio por artículo: $%,.2f",
	                numeroPieza, descripcion, cantidad, precioPorArticulo);
	    }
}
