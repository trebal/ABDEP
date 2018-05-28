package P2013.Problem2;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Drawing implements Observer {

    private ArrayList<Figure> components = new ArrayList<>();

    public void addComponent(Figure figure)
    {
        figure.observe(this);
        components.add(figure);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Object with name [" + (o) + "] has changed.");
    }
}
