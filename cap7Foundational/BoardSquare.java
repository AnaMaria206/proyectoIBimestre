package cap7Foundational;

public class BoardSquare {
    private MoverCap8 mover = null;
    private int position;

    BoardSquare(int position) {
        setPosition(position);
    }

    int getPosition() {
        return position;
    }

    private void setPosition(int position) {
        this.position = position;
    }

    public void addMover(MoverCap8 m) {
        mover = m;
    }

    private boolean hasMover() {
        return mover != null;
    }

    public void movePlayerPiece(PlayerPiece counter) {
        counter.setCurrentPosition(this);

        if (hasMover()) {
            mover.movePlayerPiece(counter);  // POLIMORFISMO ❤
        }
    }
}

