package cap7Foundational;

public abstract class MoverCap8 {

    protected BoardSquare destination;

    public MoverCap8(BoardSquare destination) {
        this.destination = destination;
    }

    public BoardSquare getDestination() {
        return destination;
    }

    public abstract void showMessage();

    public void movePlayerPiece(PlayerPiece counter) {
        showMessage();
        counter.setCurrentPosition(destination);
    }
}

