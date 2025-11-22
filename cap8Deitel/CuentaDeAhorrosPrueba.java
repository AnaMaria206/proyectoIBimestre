package cap8Deitel;

public class CuentaDeAhorrosPrueba {

	public static void main(String[] args) {
	       CuentaAhorrosEjercicio ahorrador1 = new CuentaAhorrosEjercicio(2000.00);
	        CuentaAhorrosEjercicio ahorrador2 = new CuentaAhorrosEjercicio(3000.00);

	        CuentaAhorrosEjercicio.modificarTasaInteres(0.04);

	        ahorrador1.calcularInteresMensual();
	        ahorrador2.calcularInteresMensual();

	        System.out.println("Saldo ahorrador1: " + ahorrador1.getSaldoAhorros());
	        System.out.println("Saldo ahorrador2: " + ahorrador2.getSaldoAhorros());

	        CuentaAhorrosEjercicio.modificarTasaInteres(0.05);

	        ahorrador1.calcularInteresMensual();
	        ahorrador2.calcularInteresMensual();

	        System.out.println("Nuevo saldo ahorrador1: " + ahorrador1.getSaldoAhorros());
	        System.out.println("Nuevo saldo ahorrador2: " + ahorrador2.getSaldoAhorros());
	}

}
