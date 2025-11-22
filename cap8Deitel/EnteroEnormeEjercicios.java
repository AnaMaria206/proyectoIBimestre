package cap8Deitel;

public class EnteroEnormeEjercicios {
	   private int[] digitos = new int[40];

	    // entrada: recibe un string de numeros y los guarda
	    public void entrada(String numero) {
	        for (int i = 0; i < 40; i++) digitos[i] = 0;

	        int len = numero.length();
	        if (len > 40) len = 40;

	        int pos = 40 - len;

	        for (int i = 0; i < len; i++) {
	            char c = numero.charAt(i);
	            if (Character.isDigit(c)) {
	                digitos[pos + i] = c - '0';
	            }
	        }
	    }

	    // salida: devuelve el numero sin ceros a la izquierda
	    public String salida() {
	        StringBuilder sb = new StringBuilder();
	        boolean inicio = false;

	        for (int d : digitos) {
	            if (d != 0) inicio = true;
	            if (inicio) sb.append(d);
	        }

	        return inicio ? sb.toString() : "0";
	    }

	    // suma de dos enteros enormes
	    public EnteroEnormeEjercicios sumar(EnteroEnormeEjercicios b) {
	        EnteroEnormeEjercicios res = new EnteroEnormeEjercicios();
	        int acarreo = 0;

	        for (int i = 39; i >= 0; i--) {
	            int suma = this.digitos[i] + b.digitos[i] + acarreo;
	            res.digitos[i] = suma % 10;
	            acarreo = suma / 10;
	        }

	        return res;
	    }

	    // resta (asume que this >= b)
	    public EnteroEnormeEjercicios restar(EnteroEnormeEjercicios b) {
	        EnteroEnormeEjercicios res = new EnteroEnormeEjercicios();
	        int prestamo = 0;

	        for (int i = 39; i >= 0; i--) {
	            int r = this.digitos[i] - b.digitos[i] - prestamo;
	            if (r < 0) {
	                r += 10;
	                prestamo = 1;
	            } else {
	                prestamo = 0;
	            }
	            res.digitos[i] = r;
	        }

	        return res;
	    }

	    // comparaciones
	    public boolean esIgualA(EnteroEnormeEjercicios b) {
	        for (int i = 0; i < 40; i++)
	            if (digitos[i] != b.digitos[i]) return false;
	        return true;
	    }

	    public boolean noEsIgualA(EnteroEnormeEjercicios b) {
	        return !esIgualA(b);
	    }

	    public boolean esMayorQue(EnteroEnormeEjercicios b) {
	        for (int i = 0; i < 40; i++) {
	            if (digitos[i] > b.digitos[i]) return true;
	            if (digitos[i] < b.digitos[i]) return false;
	        }
	        return false;
	    }

	    public boolean esMenorQue(EnteroEnormeEjercicios b) {
	        for (int i = 0; i < 40; i++) {
	            if (digitos[i] < b.digitos[i]) return true;
	            if (digitos[i] > b.digitos[i]) return false;
	        }
	        return false;
	    }

	    public boolean esMayorOIgualA(EnteroEnormeEjercicios b) {
	        return esMayorQue(b) || esIgualA(b);
	    }

	    public boolean esMenorOIgualA(EnteroEnormeEjercicios b) {
	        return esMenorQue(b) || esIgualA(b);
	    }

	    public boolean esCero() {
	        for (int d : digitos)
	            if (d != 0) return false;
	        return true;
	    }
}
