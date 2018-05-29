package P2013.Problem3;

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
