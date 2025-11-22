package cap8Deitel;

public class PruebaFecha {
	 public static void main(String[] args) {
	 // Caso A: cambiar de mes
    FechaEjercicio f1 = new FechaEjercicio(4, 30, 2025); // 30 de abril
    System.out.println("\n--- Probando cambio de mes ---");
    for (int i = 0; i < 2; i++) {
        System.out.println(f1);
        f1.siguienteDia();
    }

    // Caso B: cambiar de anio
    FechaEjercicio f2 = new FechaEjercicio(12, 31, 2025); // 31 diciembre
    System.out.println("\n--- Probando cambio de anio ---");
    for (int i = 0; i < 2; i++) {
        System.out.println(f2);
        f2.siguienteDia();
    }
}
}
