package Problem19;

public class Rectangle extends Figure {

    private final float width;
    private final float height;

    // Constructor
    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    // Copy constructor
    public Rectangle(Rectangle other) {
        super(other);
        this.width = other.width;
        this.height = other.height;
    }

    // Copy function
    @Override
    public Rectangle copy() {
        return new Rectangle(this);
    }
}