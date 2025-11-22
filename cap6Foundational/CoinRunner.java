package cap6Foundational;

public class CoinRunner {

	public static void main(String[] args) {

		Coin monedas [] = new Coin [3] ;
		
		monedas [0] = new Coin ();
		monedas [1] = new Coin ();
		monedas [2] = new Coin ();
		
		//usamos var ya que java deduce que es un entero 
		var numeroHead =0;
		
		//contamos cuantas heads hay
		if (monedas[0].equals("heads")) numeroHead++;
		if (monedas[1].equals("heads")) numeroHead++;
		if (monedas[2].equals("heads")) numeroHead++;
		
		if (numeroHead == 3) {
		    System.out.println("Old Yang ---- o ----");
		} else if (numeroHead == 0) {
		    System.out.println("Old Yin ---- x ----");
		} else if (numeroHead == 2) {
		    System.out.println("Young Yang -----------");
		} else if (numeroHead == 1) {
		    System.out.println("Young Yin ---- ----");
		}
		
	    Hexagram hex = new Hexagram();   
        hex.displayHexagram();           
		
		
	}

}
