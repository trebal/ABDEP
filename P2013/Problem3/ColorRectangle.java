package P2013.Problem3;

import java.awt.*;

public class ColorRectangle extends Rectangle {

    private final Color c;

    // Constructor
    public ColorRectangle(float x, float y, float width, float height, Color c) {
        super(x, y, width, height);
        this.c = c;
    }

    // Getters
    public Color getC() {
        return c;
    }
}
