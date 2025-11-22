// Fig. 8.5: Tiempo2.java
// Declaración de la clase Tiempo2 con constructores sobrecargados.
package cap8Deitel;
public class Tiempo2 {
private int hora;
private int minuto;
private int segundo;
private int segundosDesdeMedianoche;

public Tiempo2() {
    this(0, 0, 0);
}

public Tiempo2(int h) {
    this(h, 0, 0);
}

public Tiempo2(int h, int m) {
    this(h, m, 0);
}

public Tiempo2(int h, int m, int s) {
    establecerTiempo(h, m, s);
}

public Tiempo2(Tiempo2Ejercicio t) {
    this(t.obtenerHora(), t.obtenerMinuto(), t.obtenerSegundo());
}

public void establecerTiempo(int h, int m, int s) {
    h = (h >= 0 && h < 24) ? h : 0;
    m = (m >= 0 && m < 60) ? m : 0;
    s = (s >= 0 && s < 60) ? s : 0;
    segundosDesdeMedianoche = h * 3600 + m * 60 + s;
}

public void establecerHora(int h) {
    h = (h >= 0 && h < 24) ? h : 0;
    int m = obtenerMinuto();
    int s = obtenerSegundo();
    segundosDesdeMedianoche = h * 3600 + m * 60 + s;
}

public void establecerMinuto(int m) {
    m = (m >= 0 && m < 60) ? m : 0;
    int h = obtenerHora();
    int s = obtenerSegundo();
    segundosDesdeMedianoche = h * 3600 + m * 60 + s;
}

public void establecerSegundo(int s) {
    s = (s >= 0 && s < 60) ? s : 0;
    int h = obtenerHora();
    int m = obtenerMinuto();
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
    if (segundosDesdeMedianoche == 86400)
        segundosDesdeMedianoche = 0;
}

public void incrementarMinuto() {
    segundosDesdeMedianoche += 60;
    if (segundosDesdeMedianoche >= 86400)
        segundosDesdeMedianoche -= 86400;
}

public void incrementarHora() {
    segundosDesdeMedianoche += 3600;
    if (segundosDesdeMedianoche >= 86400)
        segundosDesdeMedianoche -= 86400;
}

public String aStringUniversal() {
    return String.format("%02d:%02d:%02d",
            obtenerHora(), obtenerMinuto(), obtenerSegundo());
}

@Override
public String toString() {
    int h = obtenerHora();
    int display = (h == 0 || h == 12) ? 12 : h % 12;
    String ampm = (h < 12) ? "AM" : "PM";

    return String.format("%d:%02d:%02d %s",
            display, obtenerMinuto(), obtenerSegundo(), ampm);
}
}
