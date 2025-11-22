package cap10Deitel;

import cap9Deitel.EmpleadoBaseMasComision4;
import cap9Deitel.EmpleadoPorComision3;

public class PruebaPolimorfismo {
	public static void main( String args[] )
    {
        // asigna la referencia a la superclase a una variable de la superclase
        EmpleadoPorComision3 empleadoPorComision = new EmpleadoPorComision3(
            "Sue", "Jones", "222-22-2222", 10000, .06 );

        // asigna la referencia a la subclase a una variable de la subclase
        EmpleadoBaseMasComision4 empleadoBaseMasComision =
            new EmpleadoBaseMasComision4(
                "Bob", "Lewis", "333-33-3333", 5000, .04, 300 );

        // invoca a toString en un objeto de la superclase
        System.out.printf( "%s %s:\n\n%s\n\n",
            "Llamada a toString de EmpleadoPorComision3 con referencia de superclase ",
            "a un objeto de la superclase", empleadoPorComision.toString() );

        // invoca a toString en un objeto de la subclase
        System.out.printf( "%s %s:\n\n%s\n\n",
            "Llamada a toString de EmpleadoBaseMasComision4 con referencia",
            "de subclase a un objeto de la subclase",
            empleadoBaseMasComision.toString() );

        // invoca a toString en un objeto de la subclase, usando una variable de la
        // superclase (Polimorfismo)
        EmpleadoPorComision3 empleadoPorComision2 =
            empleadoBaseMasComision;
        System.out.printf( "%s %s:\n\n%s\n",
            "Llamada a toString de EmpleadoBaseMasComision4 con referencia de superclase",
            "a un objeto de la subclase", empleadoPorComision2.toString() );
    } // fin de main
}
