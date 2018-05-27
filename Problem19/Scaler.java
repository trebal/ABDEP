package Problem19;

public class Scaler implements FigureVisitor {

    private final float scale;

    // Constructor
    public Scaler(float scale) {
        this.scale = scale;
    }

    // Getters
    public float getScale() {
        return scale;
    }

    @Override
    public void visit(Circle circle) {
        circle.setR(circle.getR() * getScale());
    }

    @Override
    public void visit(Rectangle rectangle) {

    }

    @Override
    public void visit(ColorRectangle colorRectangle) {

    }

    @Override
    public void visit(Line line) {

    }

    @Override
    public void visit(Drawing drawing) {

    }
}
