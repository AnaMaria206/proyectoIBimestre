package cap8Deitel;

public class PruebaConjuntoEnterosEjercicios {
	   public static void main(String[] args) {

	        ConjuntoEnterosEjercicios A = new ConjuntoEnterosEjercicios();
	        ConjuntoEnterosEjercicios B = new ConjuntoEnterosEjercicios();

	        A.insertarElemento(1);
	        A.insertarElemento(50);
	        B.insertarElemento(50);
	        B.insertarElemento(70);

	        System.out.println("A: " + A.aStringConjunto());
	        System.out.println("B: " + B.aStringConjunto());

	        ConjuntoEnterosEjercicios union = ConjuntoEnterosEjercicios.union(A, B);
	        System.out.println("Union: " + union.aStringConjunto());

	        ConjuntoEnterosEjercicios inter = ConjuntoEnterosEjercicios.interseccion(A, B);
	        System.out.println("Interseccion: " + inter.aStringConjunto());

	        A.eliminarElemento(50);
	        System.out.println("A sin 50: " + A.aStringConjunto());

	        System.out.println("¿A es igual a B?: " + A.esIgualA(B));
	    }
}
