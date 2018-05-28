package P2013.Problem3;

public class Line extends Figure {

    private final float x2;
    private final float y2;

    // Constructor
    public Line(float x, float y, float x2, float y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    // Getters
    public float getX2() {
        return x2;
    }

    public float getY2() {
        return y2;
    }
}
