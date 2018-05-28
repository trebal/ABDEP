package P2013.Problem2;

import java.util.Observable;

/**
 * This class acts as an adapter. Extends observable and is used as an instance
 * in any subclass of Figure.
 */
public class FigureObservable extends Observable {

    public void setModified() {
        this.setChanged();
        this.notifyObservers();
    }
}
