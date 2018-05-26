package Problem6;

public class Rectangle extends Figure {

    private final float width;
    private final float height;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public Rectangle copy() {
        return this;
    }

    @Override
    public Rectangle deepCopy() {
        return new Rectangle(this);
    }
}
