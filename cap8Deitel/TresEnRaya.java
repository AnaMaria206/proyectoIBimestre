package cap8Deitel;

public class TresEnRaya {
	  private int[][] tablero;

	    // Constructor: inicializa el tablero con ceros
	    public TresEnRaya() {
	        tablero = new int[3][3];
	    }

	    // Metodo para realizar un movimiento
	    // jugador = 1 o 2
	    public boolean mover(int fila, int columna, int jugador) {
	        // Verifica casilla vacia
	        if (tablero[fila][columna] == 0) {
	            tablero[fila][columna] = jugador;
	            return true;
	        }
	        return false;
	    }

	    // Metodo para verificar si un jugador gano
	    public int verificarGanador() {
	        // Filas
	        for (int i = 0; i < 3; i++) {
	            if (tablero[i][0] != 0 &&
	                tablero[i][0] == tablero[i][1] &&
	                tablero[i][1] == tablero[i][2]) {
	                return tablero[i][0];
	            }
	        }
	        // Columnas
	        for (int j = 0; j < 3; j++) {
	            if (tablero[0][j] != 0 &&
	                tablero[0][j] == tablero[1][j] &&
	                tablero[1][j] == tablero[2][j]) {
	                return tablero[0][j];
	            }
	        }
	        // Diagonales
	        if (tablero[0][0] != 0 &&
	            tablero[0][0] == tablero[1][1] &&
	            tablero[1][1] == tablero[2][2]) {
	            return tablero[0][0];
	        }

	        if (tablero[0][2] != 0 &&
	            tablero[0][2] == tablero[1][1] &&
	            tablero[1][1] == tablero[2][0]) {
	            return tablero[0][2];
	        }

	        // Sin ganador
	        return 0;
	    }

	    // Metodo para verificar empate
	    public boolean esEmpate() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (tablero[i][j] == 0) {
	                    return false;
	                }
	            }
	        }
	        return verificarGanador() == 0;
	    }

	    // Metodo para mostrar el tablero
	    public void mostrar() {
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(tablero[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
