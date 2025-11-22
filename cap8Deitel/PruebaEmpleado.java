package cap8Deitel;

// Fig. 8.13: PruebaEmpleado.java
// Demostración de miembros static.

public class PruebaEmpleado
{
    public static void main( String args[] )
    {
        // asume que la clase Empleado (con el campo static 'cuenta') está definida.

        // muestra que la cuenta es 0 antes de crear Empleados
        System.out.printf( "Empleados antes de instanciar: %d\n",
            Empleado.obtenerCuenta() ); // Llama al método static directamente desde la clase

        // crea dos Empleados; la cuenta debe ser 2
        Empleado e1 = new Empleado( "Susan", "Baker" );
        Empleado e2 = new Empleado( "Bob", "Blue" );

        // muestra que la cuenta es 2 después de crear dos Empleados
        System.out.println( "\nEmpleados despues de instanciar: " );
        // Acceder a métodos static a través de referencias de objeto es posible, pero desaconsejado:
        System.out.printf( "mediante e1.obtenerCuenta(): %d\n", e1.obtenerCuenta() );
        System.out.printf( "mediante e2.obtenerCuenta(): %d\n", e2.obtenerCuenta() );
        // Forma preferida de acceder a un miembro static:
        System.out.printf( "mediante Empleado.obtenerCuenta(): %d\n",
            Empleado.obtenerCuenta() );

        // obtiene los nombres de los Empleados
        System.out.printf( "\nEmpleado 1: %s %s\nEmpleado 2: %s %s\n\n",
            e1.obtenerPrimerNombre(), e1.obtenerApellidoPaterno(),
            e2.obtenerPrimerNombre(), e2.obtenerApellidoPaterno() );

        // en este ejemplo, sólo hay una referencia a cada Empleado,
        // por lo que las siguientes dos instrucciones hacen que la JVM
        // marque a cada objeto Empleado para la recolección de basura
        e1 = null; // Quita la referencia al objeto original 'Susan Baker'
        e2 = null; // Quita la referencia al objeto original 'Bob Blue'

        System.gc(); // pide que la recolección de basura se realice ahora

        // muestra la cuenta de Empleados después de llamar al recolector de basura;
        // la cuenta a mostrar puede ser 0, 1 o 2 dependiendo de si el recolector de
        // basura se ejecuta de inmediato, y del número de objetos Empleado recolectados
        System.out.printf( "\nEmpleados despues de System.gc(): %d\n",
            Empleado.obtenerCuenta() );
    } // fin de main
} // fin de la clase PruebaEmpleado