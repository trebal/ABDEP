package Problem6;

public abstract class Figure
{
    private final float x;
    private final float y;

    public Figure(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Figure(Figure other)
    {
        this.x = other.x;
        this.y = other.y;
    }

    public abstract Figure copy();
}
