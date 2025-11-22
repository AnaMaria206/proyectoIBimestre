package cap8Deitel;

public class Tiempo2Ejercicio {
    private int segundosDesdeMedianoche;

    public Tiempo2Ejercicio() {
        this(0,0,0);
    }

    public Tiempo2Ejercicio(int h, int m, int s) {
        establecerTiempo(h,m,s);
    }

    public void establecerTiempo(int h, int m, int s) {
        h = (h >= 0 && h < 24) ? h : 0;
        m = (m >= 0 && m < 60) ? m : 0;
        s = (s >= 0 && s < 60) ? s : 0;
        segundosDesdeMedianoche = h * 3600 + m * 60 + s;
    }

    public int obtenerHora() {
        return segundosDesdeMedianoche / 3600;
    }

    public int obtenerMinuto() {
        return (segundosDesdeMedianoche % 3600) / 60;
    }

    public int obtenerSegundo() {
        return segundosDesdeMedianoche % 60;
    }

    public void tictac() {
        segundosDesdeMedianoche++;
        if (segundosDesdeMedianoche >= 86400)
            segundosDesdeMedianoche = 0;
    }

    public boolean incrementarMinuto() {
        int h = obtenerHora();
        int m = obtenerMinuto() + 1;
        int s = obtenerSegundo();

        if (m == 60) m = 0;

        establecerTiempo(h,m,s);
        return m == 0; // true si se paso de 59 a 0
    }

    public boolean incrementarHora() {
        int h = obtenerHora() + 1;
        int m = obtenerMinuto();
        int s = obtenerSegundo();

        if (h == 24) h = 0;

        establecerTiempo(h,m,s);
        return h == 0; // true si se paso de 23 a 0
    }

    public String aStringUniversal() {
        return String.format("%02d:%02d:%02d",
                obtenerHora(), obtenerMinuto(), obtenerSegundo());
    }

    public String toString() {
        int h = obtenerHora();
        int display = (h == 0 || h == 12) ? 12 : h % 12;
        String ampm = (h < 12) ? "AM" : "PM";

        return String.format("%d:%02d:%02d %s",
                display, obtenerMinuto(), obtenerSegundo(), ampm);
    }
}
