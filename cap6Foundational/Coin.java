package cap6Foundational;

import java.util.Random;

public class Coin {
	private Random random = new Random();
	public String getFace ()  {

		//implementamos var ya que s variable local 
		var eleccion = random.nextBoolean();
		
		if (eleccion) {
			return "heads";
		}
	
		
		return "tails";
	}
	
}
