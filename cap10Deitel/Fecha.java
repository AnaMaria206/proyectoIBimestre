package cap10Deitel;

public class Fecha {
    private int mes; // 1-12
    private int dia; // 1-31
    private int anio; // cualquier año

    public Fecha(int elMes, int elDia, int elAnio) {
        mes = comprobarMes(elMes);
        anio = elAnio;
        dia = comprobarDia(elDia);
    }

    private int comprobarMes(int mesPrueba) {
        if (mesPrueba > 0 && mesPrueba <= 12) return mesPrueba;
        System.out.printf("Mes invalido (%d) se establecio en 1.%n", mesPrueba);
        return 1;
    }

    private int comprobarDia(int diaPrueba) {
        int diasPorMes[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        if (diaPrueba > 0 && diaPrueba <= diasPorMes[mes]) return diaPrueba;

        if (mes == 2 && diaPrueba == 29 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
            return diaPrueba;

        System.out.printf("Dia invalido (%d) se establecio en 1.%n", diaPrueba);
        return 1;
    }

    public int obtenerMes() { return mes; }
    public int obtenerDia() { return dia; }
    public int obtenerAnio() { return anio; }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", mes, dia, anio);
    }
}