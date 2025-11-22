package cap9Deitel;

public class EmpleadoPorComision4 {
	private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comisión

    // constructor con cinco argumentos
    public EmpleadoPorComision4( String nombre, String apellido, String nss,
        double ventas, double tarifa )
    {
        // la llamada implícita al constructor de Object ocurre aquí
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas( ventas ); // valida y almacena las ventas brutas
        establecerTarifaComision( tarifa ); // valida y almacena la tarifa de comisión

        // Muestra cuándo se ejecuta este constructor
        System.out.printf(
            "\nConstructor de EmpleadoPorComision4:\n%s\n", this );
    } // fin del constructor de EmpleadoPorComision4

    // establece el primer nombre
    public void establecerPrimerNombre( String nombre )
    {
        primerNombre = nombre;
    } 

    // devuelve el primer nombre
    public String obtenerPrimerNombre()
    {
        return primerNombre;
    } 

    // establece el apellido paterno
    public void establecerApellidoPaterno( String apellido )
    {
        apellidoPaterno = apellido;
    } 

    // devuelve el apellido paterno
    public String obtenerApellidoPaterno()
    {
        return apellidoPaterno;
    } 

    // establece el número de seguro social
    public void establecerNumeroSeguroSocial( String nss )
    {
        numeroSeguroSocial = nss; 
    } 

    // devuelve el número de seguro social
    public String obtenerNumeroSeguroSocial()
    { 
        return numeroSeguroSocial;
    } 

    // establece el monto de ventas brutas
    public void establecerVentasBrutas( double ventas )
    {
        ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
    } 

    // devuelve el monto de ventas brutas
    public double obtenerVentasBrutas()
    {
        return ventasBrutas;
    } 

    // establece la tarifa de comisión
    public void establecerTarifaComision( double tarifa )
    {
        tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
    } 

    // devuelve la tarifa de comisión
    public double obtenerTarifaComision()
    {
        return tarifaComision;
    } 

    // calcula los ingresos
    public double ingresos()
    {
        return obtenerTarifaComision() * obtenerVentasBrutas();
    } 

    // devuelve representación String del objeto EmpleadoPorComision4
    public String toString()
    {
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
            "empleado por comision", obtenerPrimerNombre(), obtenerApellidoPaterno(),
            "numero de seguro social", obtenerNumeroSeguroSocial(),
            "ventas brutas", obtenerVentasBrutas(),
            "tarifa de comision", obtenerTarifaComision() );
    }
}
