package Problem18;

public class Text extends Figure {

    @Override
    public void clickButton() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void drag() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public GeometricFigure makeGeometricFigure() {
        return new GeometricFigureText(this);
    }
}
