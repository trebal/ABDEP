package Problem19;

public interface FigureVisitor {
    public void visit(Circle circle);

    public void visit(Rectangle rectangle);

    public void visit(ColorRectangle colorRectangle);

    public void visit(Line line);

    public void visit(Drawing drawing);
}
