package cap10Deitel;

public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        // Fechas de nacimiento
        Fecha f1 = new Fecha(5, 15, 1980);
        Fecha f2 = new Fecha(8, 22, 1990);
        Fecha f3 = new Fecha(3, 10, 1985);
        Fecha f4 = new Fecha(7, 30, 1975);
        Fecha f5 = new Fecha(2, 5, 1992);

        // Creación de empleados
        EmpleadoAsalariado eAsalariado = new EmpleadoAsalariado("John", "Smith", "111-11-1111", f1, 800.00);
        EmpleadoPorHoras ePorHoras = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", f2, 16.75, 40);
        EmpleadoPorComision ePorComision = new EmpleadoPorComision("Sue", "Jones", "333-33-3333", f3, 10000, .06);
        EmpleadoBaseMasComision eBaseMasComision = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", f4, 5000, .04, 300);
        TrabajadorPorPiezas ePorPiezas = new TrabajadorPorPiezas("Ana", "Gomez", "555-55-5555", f5, 20, 150);

        // Arreglo de empleados
        Empleado[] empleados = {eAsalariado, ePorHoras, ePorComision, eBaseMasComision, ePorPiezas};

        System.out.println("Procesando empleados con polimorfismo:\n");

        for (Empleado emp : empleados) {
            System.out.println(emp);

            // Incremento del 10% para EmpleadoBaseMasComision
            if (emp instanceof EmpleadoBaseMasComision) {
                EmpleadoBaseMasComision ebmc = (EmpleadoBaseMasComision) emp;
                ebmc.establecerSalarioBase(ebmc.obtenerSalarioBase() * 1.10);
                System.out.printf("Salario base incrementado 10%%: $%,.2f\n", ebmc.obtenerSalarioBase());
            }

            System.out.printf("Ingresos: $%,.2f\n\n", emp.obtenerMontoPago());
        }
    }

}