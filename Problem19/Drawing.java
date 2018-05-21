package Problem19;

import java.util.LinkedList;
import java.util.List;

public class Drawing extends Figure {

    private List<Figure> figures;

    public void addFigure(Figure f) {
        figures.add(f);
    }

    // Constructor
    public Drawing(float x, float y) {
        super(x, y);
        this.figures = new LinkedList<>();
    }

    // Copy constructor
    public Drawing(Drawing other) {
        super(other);
        this.figures = new LinkedList<>();

        for (Figure f : other.figures) {
            addFigure(f);
        }
    }

    // Copy function
    @Override
    public Drawing copy() {
        return new Drawing(this);
    }
}
