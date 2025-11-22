package cap7Foundational;

public class PlayerPiece {

	  private BoardSquare currentPosition;
	    private String color;

	    public PlayerPiece(String color) {
	        this.color = color;
	    }

	    public void moveTo(BoardSquare square) {
	        setCurrentPosition(square);
	    }

	    public void setCurrentPosition(BoardSquare square) {
	        this.currentPosition = square;
	    }

	    public BoardSquare getCurrentPosition() {
	        return currentPosition;
	    }

	    public String getColor() {
	        return color;
	    }

}
