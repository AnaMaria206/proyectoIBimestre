package cap8Deitel;

public class PruebaComplejoEjercicio {
	public static void main(String[] args) {
        ComplejoEjercicio c1 = new ComplejoEjercicio(4.5, 3.2);
        ComplejoEjercicio c2 = new ComplejoEjercicio(2.0, -1.5);

        ComplejoEjercicio suma = c1.sumar(c2);
        ComplejoEjercicio resta = c1.restar(c2);

        System.out.print("c1 = ");
        c1.imprimir();

        System.out.print("c2 = ");
        c2.imprimir();

        System.out.print("suma = ");
        suma.imprimir();

        System.out.print("resta = ");
        resta.imprimir();
    }
}
