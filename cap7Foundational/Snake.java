package cap7Foundational;

public class Snake extends MoverCap8 {

    public Snake(BoardSquare head, BoardSquare tail) {
        super(tail);
        head.addMover(this);
    }

    @Override
    public void showMessage() { 
        System.out.println("Down the snake to " + destination.getPosition());
    }
}

