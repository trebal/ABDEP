package Problem6;

public class Rectangle extends Figure {
    private final float width;
    private final float height;

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

    @Override
    public Rectangle copy() {
        return new Rectangle(this);
    }
}