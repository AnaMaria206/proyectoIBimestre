package cap7Foundational;

public class GameBoard {
	private BoardSquare[] squares;
	private Dice dice;

	static final int MAX_SQUARES = 100;
	static final int START_SQUARE = 1;
	
	
	GameBoard() {
	dice = new Dice();
	squares = new BoardSquare[START_SQUARE + MAX_SQUARES];
	for (int i = START_SQUARE; i <= MAX_SQUARES; i++)
	{
	squares[i] = new BoardSquare(i);
	}

	new Ladder(squares[38], squares[1]);
	new Ladder(squares[14], squares[4]);
	new Ladder(squares[31], squares[9]);
	new Ladder(squares[42], squares[21]);
	new Ladder(squares[84], squares[28]);
	new Ladder(squares[44], squares[36]);
	new Ladder(squares[67], squares[51]);
	new Ladder(squares[91], squares[71]);
	new Ladder(squares[100], squares[80]);

	new Snake(squares[16], squares[6]);
	new Snake(squares[47], squares[26]);
	new Snake(squares[49], squares[11]);
	new Snake(squares[56], squares[53]);
	new Snake(squares[62], squares[19]);
	new Snake(squares[64], squares[60]);
	new Snake(squares[87], squares[24]);
	new Snake(squares[93], squares[73]);
	new Snake(squares[95], squares[75]);
	new Snake(squares[98], squares[78]);
	}
BoardSquare getStartSquare()
{
return squares[START_SQUARE];
}
// Ajustar el contador de la posicon
void movePlayerPiece(PlayerPiece counter)
{
BoardSquare current = counter.getCurrentPosition();
int nextPosition = current.getPosition() + dice.roll();
if(nextPosition > MAX_SQUARES)
{
System.out.println(
"Lo siento, debes caer en la ultima casilla para ganar!");
}
else
{
counter.moveTo(squares[nextPosition]);
}
System.out.println(counter.getColor() + " contador en  " +
counter.getCurrentPosition().getPosition());
}
}
