package cap9Deitel;

public class CuadrilateroEjercicio {
    private int x1, y1, x2, y2, x3, y3, x4, y4;

    public CuadrilateroEjercicio(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1; this.y1 = y1;
        this.x2 = x2; this.y2 = y2;
        this.x3 = x3; this.y3 = y3;
        this.x4 = x4; this.y4 = y4;
    }

    // Getters y Setters
    public int getX1() { return x1; } public int getY1() { return y1; }
    public int getX2() { return x2; } public int getY2() { return y2; }
    public int getX3() { return x3; } public int getY3() { return y3; }
    public int getX4() { return x4; } public int getY4() { return y4; }

    public void setX1(int x) { x1 = x; } public void setY1(int y) { y1 = y; }
    public void setX2(int x) { x2 = x; } public void setY2(int y) { y2 = y; }
    public void setX3(int x) { x3 = x; } public void setY3(int y) { y3 = y; }
    public void setX4(int x) { x4 = x; } public void setY4(int y) { y4 = y; }

    // Área “fake” para que compile
    public double area() {
        return 1; // valor ficticio
    }
}

// Subclases con área ficticia
class Paralelogramo extends CuadrilateroEjercicio {
    public Paralelogramo(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    @Override
    public double area() { return 2; }
}

class Rectangulo extends Paralelogramo {
    public Rectangulo(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    @Override
    public double area() { return 3; }
}

class Cuadrado extends Rectangulo {
    public Cuadrado(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    @Override
    public double area() { return 4; }
}

class Trapezoide extends CuadrilateroEjercicio {
    public Trapezoide(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    @Override
    public double area() { return 5; }
}