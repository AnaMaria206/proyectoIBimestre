package cap8Deitel;

public class Fecha2Ejercicios {
	  private int dia;
	    private int mes;
	    private int anio;

	    private static final String[] nombresMes = {
	            "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
	            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
	    };

	    private static final int[] diasMes = {
	            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
	    };

	    // Constructor 1: MM/DD/AAAA
	    public Fecha2Ejercicios(int mes, int dia, int anio) {
	        this.mes = mes;
	        this.dia = dia;
	        this.anio = anio;
	    }

	    // Constructor 2: NombreMes, dia, anio
	    public Fecha2Ejercicios(String nombreMes, int dia, int anio) {
	        this.mes = convertirMes(nombreMes);
	        this.dia = dia;
	        this.anio = anio;
	    }

	    // Constructor 3: DDD, AAAA
	    public Fecha2Ejercicios(int diaDelAnio, int anio) {
	        this.anio = anio;
	        convertirDesdeDiaDelAnio(diaDelAnio);
	    }

	    private int convertirMes(String nombreMes) {
	        for (int i = 1; i <= 12; i++) {
	            if (nombresMes[i].equalsIgnoreCase(nombreMes)) {
	                return i;
	            }
	        }
	        return 1;
	    }

	    private void convertirDesdeDiaDelAnio(int d) {
	        int m = 1;
	        while (d > diasMes[m]) {
	            d -= diasMes[m];
	            m++;
	        }
	        mes = m;
	        dia = d;
	    }

	    // Formato 1: MM/DD/AAAA
	    public String formatoNumero() {
	        return String.format("%02d/%02d/%d", mes, dia, anio);
	    }

	    // Formato 2: Junio 15, 1992
	    public String formatoTexto() {
	        return String.format("%s %d, %d", nombresMes[mes], dia, anio);
	    }

	    // Formato 3: DDD AAAA
	    public String formatoDiaDelAnio() {
	        return String.format("%d %d", obtenerDiaDelAnio(), anio);
	    }

	    private int obtenerDiaDelAnio() {
	        int d = dia;
	        for (int i = 1; i < mes; i++) {
	            d += diasMes[i];
	        }
	        return d;
	    }
}
