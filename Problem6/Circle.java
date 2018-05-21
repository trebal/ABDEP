package Problem6;

public class Circle extends Figure
{
    private final float r;

    public Circle(float x, float y, float r)
    {
        super(x, y);
        this.r = r;
    }

    // Copy constructor
    public Circle(Circle other)
    {
        super(other);
        this.r = other.r;
    }

    @Override
    public Circle copy()
    {
        return new Circle(this);
    }
}
