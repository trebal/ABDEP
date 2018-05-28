package P2013.Problem2;

public class Main {

    /**
     * A basic background with a Drawing and a Circle added to it. Once the circle
     * changes its value, it notifies the observer and prints a message.
     *
     * @param args Any bullshit you want (does nothing).
     */
    public static void main(String[] args) {
        Drawing drawing = new Drawing();
        Circle circle = new Circle(0, 0, 2);
        Rectangle rectangle = new Rectangle(1, 1, 5, 2);

        drawing.addComponent(circle);
        drawing.addComponent(rectangle);

        circle.setR(3);
        rectangle.setWidth(2);
        rectangle.setHeight(4);
    }
}
