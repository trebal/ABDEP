package Problem19;

public class Circle extends Figure implements Scalable
{
    private float r;

    // Constructor
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

    // Copy function
    @Override
    public Circle copy()
    {
        return new Circle(this);
    }

    // Setters
    public void setR(float r) {
        this.r = r;
    }

    // Getters
    public float getR() {
        return r;
    }

    @Override
    public void accept(FigureVisitor figureVisitor)
    {
        figureVisitor.visit(this);
    }
}
