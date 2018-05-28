package P2013.Problem2;

import java.util.Observer;

/**
 * A class with a "constraint" of not being capable of extend Observable.
 * In order to make the subclasses Observable it is needed the use of the pattern
 * "Object adapter". This class holds a FigureObservable that actually extends
 * Observer thus making possible for a class that cannot extend Observable, be
 * in some way Observable.
 */
public abstract class Figure {

    private float x;
    private float y;

    protected FigureObservable observable = new FigureObservable();

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

    /**
     * A method that allows to set a new Observer.
     *
     * @param observer The observer instance.
     */
    public void observe(Observer observer) {
        observable.addObserver(observer);
    }
}
