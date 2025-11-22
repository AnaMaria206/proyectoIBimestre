package cap10Deitel;

import java.util.Calendar;

public class PruebaSistemaNomina {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[4];

        empleados[0] = new EmpleadoAsalariado("John", "Smith", "111-11-1111",
                new Fecha(11, 25, 1990), 800.00);
        empleados[1] = new EmpleadoPorHoras("Karen", "Price", "222-22-2222",
                new Fecha(3, 14, 1985), 16.75, 42);
        empleados[2] = new EmpleadoPorComision("Sue", "Jones", "333-33-3333",
                new Fecha(11, 25, 1992), 10000, 0.06);
        empleados[3] = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444",
                new Fecha(4, 5, 1980), 5000, 0.04, 300);

        Calendar calendario = Calendar.getInstance();
        int mesActual = calendario.get(Calendar.MONTH) + 1;

        for (Empleado emp : empleados) {
            double ingreso = emp.ingresos();

            // Bonificación cumpleaños
            if (emp.obtenerFechaNacimiento().obtenerMes() == mesActual) {
                System.out.println("¡Feliz cumpleaños! Bonificación de $100 aplicada.");
                ingreso += 100;
            }

            System.out.println(emp);
            System.out.printf("Ingresos: $%,.2f%n%n", ingreso);
        }
    }
}