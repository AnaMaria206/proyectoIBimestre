package cap9Deitel;

public class EmpleadoPorComision extends Object {
	private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas; // ventas semanales totales
    private double tarifaComision; // porcentaje de comisión

    // constructor con cinco argumentos
    public EmpleadoPorComision( String nombre, String apellido, String nss,
        double ventas, double tarifa )
    {
        // la llamada implícita al constructor del objeto ocurre aquí
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas( ventas ); // valida y almacena
        establecerTarifaComision( tarifa ); // valida y almacena
    } // fin del constructor

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

    // establece el monto de ventas totales del empleado por comisión
    public void establecerVentasBrutas( double ventas )
    {
        ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
    } 

    // devuelve el monto de ventas totales del empleado por comisión
    public double obtenerVentasBrutas()
    {
        return ventasBrutas;
    } 

    // establece la tarifa del empleado por comisión
    public void establecerTarifaComision( double tarifa )
    {
        tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
    } 

    // devuelve la tarifa del empleado por comisión
    public double obtenerTarifaComision()
    {
        return tarifaComision;
    } 

    // calcula el salario del empleado por comisión
    public double ingresos()
    {
        return tarifaComision * ventasBrutas;
    } // fin del método ingresos

    // devuelve representación String del objeto EmpleadoPorComision
    public String toString()
    {
        return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
            "empleado por comision", primerNombre, apellidoPaterno,
            "numero de seguro social", numeroSeguroSocial,
            "ventas brutas", ventasBrutas,
            "tarifa de comision", tarifaComision );
    } // fin del método toString
}
