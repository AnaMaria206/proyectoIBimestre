package cap7Foundational;

public class Ladder extends MoverCap8 {

    public Ladder(BoardSquare top, BoardSquare foot) {
        super(top);
        foot.addMover(this);
    }

    @Override
    public void showMessage() {
        System.out.println("Up the ladder to " + destination.getPosition());
    }
}
