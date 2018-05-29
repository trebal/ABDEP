package P2013.Problem3;

import java.awt.*;

public abstract class Figure {

    private final float x;
    private final float y;

    // Constructor
    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public FigureBuilder create() {
        return new FigureBuilder();
    }

    public static class FigureBuilder {

        private float x;
        private float y;

        private float r;
        private float w;
        private float h;
        private float x2;
        private float y2;
        private Color c;

        private boolean pos_set = false;
        private boolean r_set = false;
        private boolean dim_set = false;
        private boolean from_set = false;
        private boolean to_set = false;
        private boolean c_set = false;

        public FigureBuilder at(float x, float y) {
            this.x = x;
            this.y = y;
            pos_set = true;

            return this;
        }

        public FigureBuilder withRadius(float r) {
            this.r = r;
            r_set = true;

            return this;
        }

        public FigureBuilder withDims(float w, float h) {
            this.w = w;
            this.h = h;
            dim_set = true;

            return this;
        }

        public FigureBuilder from_pos(float x2) {
            this.x2 = x2;
            from_set = true;

            return this;
        }

        public FigureBuilder to_pos(float y2) {
            this.y2 = y2;
            to_set = true;

            return this;
        }

        public FigureBuilder in(Color c) {
            this.c = c;
            c_set = true;

            return this;
        }

        public Figure execute() {
            // No positions set, return null.
            if (!pos_set) {
                return null;
            }
            // Return Circle if only radius has been set.
            else if (r_set) {
                if (dim_set || from_set || to_set || c_set) {
                    return null;
                } else {
                    return new Circle(x, y, r);
                }
            }
            // Return Rectangle if only dimensions has been set.
            else if (dim_set) {
                if (from_set || to_set) {
                    return null;
                } else {
                    // ColorRectangle
                    if (c_set) {
                        return new ColorRectangle(x, y, w, h, c);
                    }
                    // Rectangle
                    else {
                        return new Rectangle(x, y, w, h);
                    }
                }
            }
            // Return Line if only dimensions has been set.
            else if (from_set && to_set) {
                if (c_set) {
                    return null;
                } else {
                    return new Line(x, y, x2, y2);
                }
            }
            return null;
        }
    }
}
