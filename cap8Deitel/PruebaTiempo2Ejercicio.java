package cap8Deitel;

public class PruebaTiempo2Ejercicio {
	  public static void main(String[] args) {

	        Tiempo2Ejercicio t = new Tiempo2Ejercicio();

	        System.out.println("Probando establecerTiempo con valores invalidos:\n");

	        // No retorna boolean, asi que solo probamos efectos
	        t.establecerTiempo(30, 20, 10); 
	        System.out.println("Intento con hora invalida (30): " + t.aStringUniversal());

	        t.establecerTiempo(10, 80, 10);
	        System.out.println("Intento con minuto invalido (80): " + t.aStringUniversal());

	        t.establecerTiempo(10, 20, 90);
	        System.out.println("Intento con segundo invalido (90): " + t.aStringUniversal());

	        t.establecerTiempo(25, 10, 10);
	        System.out.println("Intento con tiempo invalido (25:10:10): " + t.aStringUniversal());

	        System.out.println("\nProbando tictac, incrementarMinuto e incrementarHora:\n");

	        // tictac
	        t.establecerTiempo(11, 59, 59);
	        System.out.println("Antes de tictac: " + t.aStringUniversal());
	        t.tictac();
	        System.out.println("Despues de tictac: " + t.aStringUniversal());

	        // incrementarMinuto
	        t.establecerTiempo(10, 59, 30);
	        System.out.println("\nAntes de incrementar minuto: " + t.aStringUniversal());
	        boolean cambioHora = t.incrementarMinuto();
	        System.out.println("Despues: " + t.aStringUniversal() +
	                           " | cambio de hora? " + cambioHora);

	        // incrementarHora
	        t.establecerTiempo(23, 10, 30);
	        System.out.println("\nAntes de incrementar hora: " + t.aStringUniversal());
	        boolean diaNuevo = t.incrementarHora();
	        System.out.println("Despues: " + t.aStringUniversal() +
	                           " | cambio de dia? " + diaNuevo);

	        // cambio de dia completo
	        t.establecerTiempo(23, 59, 59);
	        System.out.println("\nAntes del ultimo tictac: " + t.aStringUniversal());
	        t.tictac();
	        System.out.println("Despues del ultimo tictac: " + t.aStringUniversal());

	        System.out.println("\nEstado final del objeto:");
	        System.out.println(t.aStringUniversal());
	    }
}
