package Problem6;

public class Line extends Figure {

    private final float x2;
    private final float y2;

    public Line(float x, float y, float x2, float y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(Line line) {
        super(line);
        this.x2 = line.x2;
        this.y2 = line.y2;
    }

    @Override
    public Line copy() {
        return this;
    }

    @Override
    public Line deepCopy() {
        return new Line(this);
    }
}
