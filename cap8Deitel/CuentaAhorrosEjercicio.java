package cap8Deitel;

public class CuentaAhorrosEjercicio {
	private static double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaAhorrosEjercicio(double saldoInicial) {
        this.saldoAhorros = saldoInicial;
    }

    public void calcularInteresMensual() {
        double interes = saldoAhorros * (tasaInteresAnual / 12);
        saldoAhorros += interes;
    }

    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }
}
