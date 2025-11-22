package cap7Foundational;

import java.util.Random;

public class Dice {
	public int roll()
	{
	double randomNumber = Math.random();
	randomNumber *= 6;
	randomNumber++;
	return (int)randomNumber;
	} 
	
	public int getRoll()
	 {
	 Random randomNumberGenerator = new Random();
	 int randomNumber = randomNumberGenerator.nextInt(6) + 1;
	 return randomNumber;
	 } 
	

	
}
