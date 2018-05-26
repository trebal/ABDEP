package Problem6;

import java.util.ArrayList;

public class Drawing extends Figure {

    private final ArrayList<Figure> components = new ArrayList<>();

    public Drawing(float x, float y) {
        super(x, y);
    }

    private Drawing(Drawing drawing) {
        super(drawing);
    }

    /**
     * The copy method works different from the others simple classes. The object has to return itself,
     * keeping the references to the list but no duping the contents. To do this, the method keeps the basic
     * attributes and creates a new list but the list has to refer the same objects.
     * @return A superficially copied object.
     */
    @Override
    public Figure copy() {
        Drawing drawing = new Drawing(this);
        for (Figure component : components) {
            drawing.addComponent(component.copy());
        }
        return drawing;
    }

    /**
     * Opposite to the <b>copy</b> method, this one deep copies all its components and returns a new object,
     * duping its contents as well as not referencing but deep copying the <p>Drawing itself.</p>
     * @return A deep copy object (and components).
     */
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

    public Figure getComponent(int index) {
        return components.get(index);
    }
}
