package Problem7;

import java.util.Observable;
import java.util.Observer;

public class Logger implements Observer {

    // Pull action

    public void update(Observable obs, Object arg) {
        Sale s = (Sale) obs;
        SLI last = s.getLast();
        System.out.println(last);
    }

    // Push action
    /*
    public void update(Observable obs, Object arg) {
        SLI last = (SLI)arg;
        System.out.println(last);
    }
    */
}
