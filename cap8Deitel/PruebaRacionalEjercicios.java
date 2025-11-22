package cap8Deitel;

public class PruebaRacionalEjercicios {
	   public static void main(String[] args) {

	        RacionalEjercicios r1 = new RacionalEjercicios(2, 4);  // Se vuelve 1/2
	        RacionalEjercicios r2 = new RacionalEjercicios(3, 9);  // Se vuelve 1/3

	        System.out.println("r1 = " + r1.aString());
	        System.out.println("r2 = " + r2.aString());

	        System.out.println("\nSuma: " + r1.sumar(r2).aString());
	        System.out.println("Resta: " + r1.restar(r2).aString());
	        System.out.println("Multiplicacion: " + r1.multiplicar(r2).aString());
	        System.out.println("Division: " + r1.dividir(r2).aString());

	        System.out.println("\nr1 decimal (4 decimales): " + r1.aDecimal(4));
	        System.out.println("r2 decimal (2 decimales): " + r2.aDecimal(2));
	    }
}
