package cap7Foundational;

public class SnakesAndLadders {

	private GameBoard board;
	
	public SnakesAndLadders()
	{
	board = new GameBoard();
	}
	//metodo para jugar
	public void play()	{
	PlayerPiece counter = new PlayerPiece("Red");
	counter.setCurrentPosition(board.getStartSquare());
	
	while(counter.getCurrentPosition().getPosition() < GameBoard.MAX_SQUARES) {
	board.movePlayerPiece(counter);
	}
	System.out.println(counter.getColor() +
	" counter finished on " +
	counter.getCurrentPosition().getPosition());
	}
	//main para probar
	public static void main(String[] args)
	{
	SnakesAndLadders myGame = new SnakesAndLadders();
	myGame.play();
	}
	}
	
	

