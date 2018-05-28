package P2013.Problem2;

public class Rectangle extends Figure {

    private float width;
    private float height;

    // Constructor
    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    // Setters
    public void setWidth(float width) {
        this.width = width;
        observable.setModified();
    }

    public void setHeight(float height) {
        this.height = height;
        observable.setModified();
    }

    // Getters
    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
