package cap6Foundational;

public class Hexagram {
	
	  private String[] lineas = new String[6];  

	    public Hexagram() {
	        // Generar las 6 líneas
	        for (int i = 0; i < 6; i++) {
	            lineas[i] = generateLineas();
	        }
	    }

	    // Usando tres monedas genera
	    private String generateLineas() {

	        Coin c1 = new Coin();
	        Coin c2 = new Coin();
	        Coin c3 = new Coin();

	        String f1 = c1.getFace();
	        String f2 = c2.getFace();
	        String f3 = c3.getFace();

	        int heads = 0;

	        if (f1.equals("heads")) heads++;
	        if (f2.equals("heads")) heads++;
	        if (f3.equals("heads")) heads++;

	        // Determinar tipo de línea
	        if (heads == 3) {
	            return "Old Yang   ---- o ----";
	        } else if (heads == 0) {
	            return "Old Yin    ---- x ----";
	        } else if (heads == 2) {
	            return "Young Yang -----------";
	        } else {
	            return "Young Yin  ---- ----";
	        }
	    }

	    public void displayHexagram() {
	        System.out.println("I Ching Hexagram:");
	        for (int i = 0; i < 6; i++) {
	            System.out.println(lineas[i]);
	        }
	    }
	}


