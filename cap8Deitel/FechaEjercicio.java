package cap8Deitel;

public class FechaEjercicio {
	 private int mes;
	    private int dia;
	    private int anio;

	    public FechaEjercicio(int m, int d, int a) {
	        anio = (a > 0) ? a : 1;
	        mes = comprobarMes(m);
	        dia = comprobarDia(d);
	    }

	    private int comprobarMes(int m) {
	        return (m >= 1 && m <= 12) ? m : 1;
	    }

	    private int comprobarDia(int d) {
	        int[] diasMes = {0,31,28,31,30,31,30,31,31,30,31,30,31};

	        if (d >= 1 && d <= diasMes[mes]) return d;

	        if (mes == 2 && d == 29 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
	            return d;

	        return 1;
	    }

	    public void siguienteDia() {
	        int[] diasMes = {0,31,28,31,30,31,30,31,31,30,31,30,31};

	        boolean bisiesto = (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0));
	        int limite = (mes == 2 && bisiesto) ? 29 : diasMes[mes];

	        if (dia < limite) dia++;
	        else {
	            dia = 1;
	            if (mes < 12) mes++;
	            else {
	                mes = 1;
	                anio++;
	            }
	        }
	    }

	    public String toString() {
	        return String.format("%02d/%02d/%04d", mes, dia, anio);
	    }
}
