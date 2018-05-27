package P2016.Problem3;

public abstract class Figure {

    private final double x;
    private final double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Builder create() {
        return new Builder();
    }

    public static class Builder {

        private int x;
        private int y;

        private double width;
        private double height;
        private double radius;

        private boolean coord_set = false;
        private boolean dimensions_set = false;
        private boolean radius_set = false;

        public Builder at(int x, int y) {
            if (!coord_set) {
                this.x = x;
                this.y = y;
            }

            return this;
        }

        public Builder withDimensions(double width, double height) {
            if (radius_set) {
                throw new IllegalStateException();
            }
            this.width = width;
            this.height = height;
            dimensions_set = true;

            return this;
        }

        public Builder withRadius(double radius) {
            if (dimensions_set) {
                throw new IllegalStateException();
            }
            this.radius = radius;
            radius_set = true;

            return this;
        }

        public Figure execute() {
            if (radius_set) {
                return new Circle(this.x, this.y, this.radius);
            } else if (dimensions_set) {
                return new Rectangle(this.x, this.y, this.width, this.height);
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
