package cap10Deitel;

public class PruebaTrabajadorPorPiezas {
	   public static void main(String[] args) {
	        // Crear empleados de distintos tipos
	        Empleado[] empleados = new Empleado[5];

	        empleados[0] = new EmpleadoAsalariado("John", "Smith", "111-11-1111",
	                new Fecha(5, 15, 1985), 800.00);
	        empleados[1] = new EmpleadoPorHoras("Karen", "Price", "222-22-2222",
	                new Fecha(3, 20, 1990), 16.75, 40);
	        empleados[2] = new EmpleadoPorComision("Sue", "Jones", "333-33-3333",
	                new Fecha(7, 10, 1988), 10000, 0.06);
	        empleados[3] = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444",
	                new Fecha(12, 1, 1975), 5000, 0.04, 300);
	        empleados[4] = new TrabajadorPorPiezas("Ana", "María", "555-55-5555",
	                new Fecha(11, 21, 1995), 20.0, 150);

	        // Procesar empleados en forma polimórfica
	        for (Empleado emp : empleados) {
	            System.out.println(emp); // toString
	            System.out.printf("Ingresos: $%,.2f\n\n", emp.ingresos());
	        }
	    }
}
