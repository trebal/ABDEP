package Problem6;

import java.util.ArrayList;

public class Drawing extends Figure {

    private final ArrayList<Figure> components = new ArrayList<>();

    public Drawing(float x, float y) {
        super(x, y);
    }

    public Drawing(Drawing drawing) {
        super(drawing);
    }

    @Override
    public Figure copy() {
        return this;
    }

    @Override
    public Figure deepCopy() {
        Drawing drawing = new Drawing(this);
        for (Figure component : components) {
            drawing.addComponent(component.deepCopy());
        }
        return drawing;
    }

    public void addComponent(Figure figure) {
        components.add(figure);
    }
}
