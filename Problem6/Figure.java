package Problem6;

public abstract class Figure {

    private final float x;
    private final float y;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * The copy constructor, used by subclasses to realise a deep copy.
     * @param figure The <p>Figure</p> to be copied.
     */
    public Figure(Figure figure) {
        this.x = figure.x;
        this.y = figure.y;
    }

    public abstract Figure copy();

    public abstract Figure deepCopy();
}
