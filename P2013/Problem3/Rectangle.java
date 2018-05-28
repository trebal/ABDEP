package P2013.Problem3;

import P2013.Problem2.Figure;

import java.awt.*;

public class Rectangle extends Figure {

    private final float width;
    private final float height;

    // Constructor
    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    // Getters
    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
