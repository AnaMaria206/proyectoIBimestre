package cap8Deitel;
public class Empleado
{
    private String primerNombre;
    private String apellidoPaterno;
    private static int cuenta = 0; // número de objetos en memoria

    // inicializa empleado, suma 1 a la variable static cuenta e
    // imprime objeto String que indica que se llamó al constructor
    public Empleado( String nombre, String apellido )
    {
        primerNombre = nombre;
        apellidoPaterno = apellido;

        cuenta++; // incrementa la variable static cuenta de empleados
        System.out.printf( "Constructor de Empleado: %s %s; cuenta = %d\n",
            primerNombre, apellidoPaterno, cuenta );
    } // fin de constructor de Empleado

    // resta 1 a la variable static cuenta cuando el recolector
    // de basura llama a finalize para borrar el objeto;
    // confirma que se llamó a finalize
    @Override // Sobrescribe el método finalize de java.lang.Object
    protected void finalize()
    {
        cuenta--; // decrementa la variable static cuenta de empleados
        System.out.printf( "Finalizador de Empleado: %s %s; cuenta = %d\n",
            primerNombre, apellidoPaterno, cuenta );
    } // fin del método finalize

    // obtiene el primer nombre
    public String obtenerPrimerNombre()
    {
        return primerNombre;
    } // fin del método obtenerPrimerNombre

    // obtiene el apellido paterno
    public String obtenerApellidoPaterno()
    {
        return apellidoPaterno;
    } // fin del método obtenerApellidoPaterno

    // método static para obtener el valor de la variable static cuenta
    public static int obtenerCuenta()
    {
        return cuenta;
    } // fin del método obtenerCuenta // fin de la clase Empleado
}

