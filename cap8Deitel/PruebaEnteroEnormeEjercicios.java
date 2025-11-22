package cap8Deitel;

public class PruebaEnteroEnormeEjercicios {
	public static void main(String[] args) {

        EnteroEnormeEjercicios a = new EnteroEnormeEjercicios();
        EnteroEnormeEjercicios b = new EnteroEnormeEjercicios();

        a.entrada("9999999999999999999999999999999999999999");
        b.entrada("1");

        System.out.println("a = " + a.salida());
        System.out.println("b = " + b.salida());

        System.out.println("\nsuma: " + a.sumar(b).salida());
        System.out.println("resta: " + a.restar(b).salida());

        System.out.println("\nComparaciones:");
        System.out.println("a == b: " + a.esIgualA(b));
        System.out.println("a != b: " + a.noEsIgualA(b));
        System.out.println("a > b: " + a.esMayorQue(b));
        System.out.println("a < b: " + a.esMenorQue(b));
        System.out.println("a >= b: " + a.esMayorOIgualA(b));
        System.out.println("a <= b: " + a.esMenorOIgualA(b));

        System.out.println("\na es cero?: " + a.esCero());
    }
}
