package P2013.Problem3;

import P2013.Problem2.Figure;

public class Circle extends Figure {

    private final float r;

    // Constructor
    public Circle(float x, float y, float r) {
        super(x, y);
        this.r = r;
    }

    // Getters
    public float getR() {
        return r;
    }
}
