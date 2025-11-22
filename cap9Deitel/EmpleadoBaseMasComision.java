package cap9Deitel;

public class EmpleadoBaseMasComision {
	private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comisión
    private double salarioBase; // salario base por semana

    // constructor con seis argumentos
    public EmpleadoBaseMasComision( String nombre, String apellido,
        String nss, double ventas, double tarifa, double salario )
    {
        // la llamada implícita al constructor de Object ocurre aquí
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nss;
        establecerVentasBrutas( ventas ); // valida y almacena las ventas brutas
        establecerTarifaComision( tarifa ); // valida y almacena la tarifa de comisión
        establecerSalarioBase( salario ); // valida y almacena el salario base
    } // fin del constructor

    // Métodos establecer y obtener para primerNombre, apellidoPaterno y numeroSeguroSocial
    public void establecerPrimerNombre( String nombre ) { primerNombre = nombre; }
    public String obtenerPrimerNombre() { return primerNombre; }

    public void establecerApellidoPaterno( String apellido ) { apellidoPaterno = apellido; }
    public String obtenerApellidoPaterno() { return apellidoPaterno; }

    public void establecerNumeroSeguroSocial( String nss ) { numeroSeguroSocial = nss; }
    public String obtenerNumeroSeguroSocial() { return numeroSeguroSocial; }

    // Métodos para ventasBrutas
    public void establecerVentasBrutas( double ventas )
    {
        ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
    }
    public double obtenerVentasBrutas()
    {
        return ventasBrutas;
    }

    // Métodos para tarifaComision
    public void establecerTarifaComision( double tarifa )
    {
        tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
    }
    public double obtenerTarifaComision()
    {
        return tarifaComision;
    }

    // Métodos para salarioBase
    public void establecerSalarioBase( double salario )
    {
        salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
    }
    public double obtenerSalarioBase()
    {
        return salarioBase;
    }

    // calcula los ingresos
    public double ingresos()
    {
        // Ingresos = Salario Base + ( Tarifa Comisión * Ventas Brutas )
        return salarioBase + ( tarifaComision * ventasBrutas );
    } //fin del método ingresos

    // devuelve representación String de EmpleadoBaseMasComision
    public String toString()
    {
        return String.format(
            "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
            "empleado por comision con sueldo base", primerNombre, apellidoPaterno,
            "numero de seguro social", numeroSeguroSocial,
            "ventas brutas", ventasBrutas, "tarifa de comision", tarifaComision,
            "salario base", salarioBase );
    } // fin del método toString
}
