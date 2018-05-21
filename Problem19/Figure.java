package Problem19;

public abstract class Figure {

    private final float x;
    private final float y;

    // Constructor
    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Figure(Figure other) {
        this.x = other.x;
        this.y = other.y;
    }

    // Copy function
    public abstract Figure copy();

    // Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
