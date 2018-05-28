package P2013.Problem2;

public class Circle extends Figure {

    private float r;

    // Constructor
    public Circle(float x, float y, float r) {
        super(x, y);
        this.r = r;
    }

    // Setters
    public void setR(float r) {
        this.r = r;
        observable.setModified();
    }

    // Getters
    public float getR() {
        return r;
    }
}
