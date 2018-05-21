package Problem18;

public class Text {

    private String content;

    public Text(String content)
    {
        this.content = content;
    }

    public GeomText makeGeomFigure()
    {
        return new GeomText(this);
    }
}
