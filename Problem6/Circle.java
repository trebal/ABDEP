package Problem6;

public class Circle extends Figure {

    private final float r;

    public Circle(float x, float y, float r) {
        super(x, y);
        this.r = r;
    }

    /**
     * The copy constructor. Takes a <p>Circle</p> and returns a new <p>Circle</p> with the same parameters (deep copy).
     * Needs a constructor in the super class that takes this Circle and processes it.
     * @param circle The <p>Circle</p> to be copied.
     */
    public Circle(Circle circle) {
        super(circle);
        this.r = circle.r;
    }

    @Override
    public Circle copy() {
        return this;
    }

    @Override
    public Circle deepCopy() {
        return new Circle(this);
    }
}
