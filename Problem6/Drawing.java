package Problem6;

import java.util.List;

public class Drawing extends Figure
{
    protected List<Figure> figures;

    public Drawing(float x, float y) {
        super(x, y);
    }

    public void addFigure(Figure f)
    {
        figures.add(f);
    }

    @Override
    public Figure copy() {
        return null;
    }
}
