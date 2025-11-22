package cap8Deitel;

public class ConjuntoEnterosEjercicios {
    private boolean[] conjunto;

    public ConjuntoEnterosEjercicios() {
        conjunto = new boolean[101]; // conjunto vacío
    }

    public void insertarElemento(int k) {
        if (k >= 0 && k <= 100)
            conjunto[k] = true;
    }

    public void eliminarElemento(int m) {
        if (m >= 0 && m <= 100)
            conjunto[m] = false;
    }

    public static ConjuntoEnterosEjercicios union(ConjuntoEnterosEjercicios a,
                                                  ConjuntoEnterosEjercicios b) {

        ConjuntoEnterosEjercicios resultado = new ConjuntoEnterosEjercicios();

        for (int i = 0; i <= 100; i++) {
            resultado.conjunto[i] = a.conjunto[i] || b.conjunto[i];
        }

        return resultado;
    }

    public static ConjuntoEnterosEjercicios interseccion(ConjuntoEnterosEjercicios a,
                                                         ConjuntoEnterosEjercicios b) {

        ConjuntoEnterosEjercicios resultado = new ConjuntoEnterosEjercicios();

        for (int i = 0; i <= 100; i++) {
            resultado.conjunto[i] = a.conjunto[i] && b.conjunto[i];
        }

        return resultado;
    }

    public boolean esIgualA(ConjuntoEnterosEjercicios otro) {
        for (int i = 0; i <= 100; i++) {
            if (this.conjunto[i] != otro.conjunto[i])
                return false;
        }
        return true;
    }

    public String aStringConjunto() {
        StringBuilder sb = new StringBuilder();
        boolean vacio = true;

        for (int i = 0; i <= 100; i++) {
            if (conjunto[i]) {
                sb.append(i).append(" ");
                vacio = false;
            }
        }

        return vacio ? "---" : sb.toString().trim();
    }
}
