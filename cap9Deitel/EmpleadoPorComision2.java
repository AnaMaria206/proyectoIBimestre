package cap9Deitel;

public class EmpleadoPorComision2 {
	// Miembros de instancia declarados como protected
    protected String primerNombre;
    protected String apellidoPaterno;
    protected String numeroSeguroSocial;
    protected double ventasBrutas; // ventas totales por semana
    protected double tarifaComision; // porcentaje de comisión

    // constructor con cinco argumentos
    public EmpleadoPorComision2( String nombre, String apellido, String nss,
        double ventas, double tarifa )
    {
        // la llamada implícita al constructor del objeto ocurre aquí
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas( ventas ); // valida y almacena las ventas brutas
        establecerTarifaComision( tarifa ); // valida y almacena la tarifa de comisión
    } // fin del constructor

    // Métodos establecer y obtener (setters/getters)
    // ... (Se han omitido por brevedad, ya que son idénticos a la versión original,
    // pero se incluyen aquí para la integridad del código.)

    public void establecerPrimerNombre( String nombre ) { primerNombre = nombre; }
    public String obtenerPrimerNombre() { return primerNombre; }

    public void establecerApellidoPaterno( String apellido ) { apellidoPaterno = apellido; }
    public String obtenerApellidoPaterno() { return apellidoPaterno; }

    public void establecerNumeroSeguroSocial( String nss ) { numeroSeguroSocial = nss; }
    public String obtenerNumeroSeguroSocial() { return numeroSeguroSocial; }

    public void establecerVentasBrutas( double ventas )
    {
        ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
    } 
    public double obtenerVentasBrutas() { return ventasBrutas; }

    public void establecerTarifaComision( double tarifa )
    {
        tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
    }
    public double obtenerTarifaComision() { return tarifaComision; }

    // calcula los ingresos
    public double ingresos()
    {
        return tarifaComision * ventasBrutas;
    } // fin del método ingresos

    // devuelve representación String del objeto EmpleadoPorComision2
    public String toString()
    {
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
            "empleado por comision", primerNombre, apellidoPaterno,
            "numero de seguro social", numeroSeguroSocial, 
            "ventas brutas", ventasBrutas,
            "tarifa de comision", tarifaComision );
    } // fin del método toString
}
