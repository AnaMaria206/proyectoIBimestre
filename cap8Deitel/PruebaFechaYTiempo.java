package cap8Deitel;

public class PruebaFechaYTiempo {
    public static void main(String[] args) {

        FechaYTiempoEjercicio ft =
            new FechaYTiempoEjercicio(12,31,2024,23,30,0);

        System.out.println(ft);

        for (int i = 0; i < 3; i++) {
            ft.incrementarHora();
            System.out.println(ft);
        }
    }
}
