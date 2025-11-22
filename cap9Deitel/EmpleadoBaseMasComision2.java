package cap9Deitel;

public class EmpleadoBaseMasComision2 extends EmpleadoPorComision{

	private double salarioBase;
	
	public EmpleadoBaseMasComision2(String nombre, String apellido, String nss, double ventas, double tarifa) {
		super(nombre, apellido, nss, ventas, tarifa);
		
	}


public void establecerSalarioBase( double salario )
{
    salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
}

public double obtenerSalarioBase()
{
    return salarioBase;
}


public double ingresos()
{
    return salarioBase + ( obtenerTarifaComision() * obtenerVentasBrutas() );
}


public String toString()
{
    return String.format(
        "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
        "empleado por comision con sueldo base", obtenerPrimerNombre(), obtenerApellidoPaterno(),
        "numero de seguro social", obtenerNumeroSeguroSocial(),
        "ventas brutas", obtenerVentasBrutas(), 
        "tarifa de comision", obtenerTarifaComision(),
        "salario base", salarioBase );
}

	
}
