package P2017.Problem2;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class MachineComposite extends MachineComponent implements Observer {

    private ArrayList<MachineComponent> components = new ArrayList<>();

    public MachineComposite(long id) {
        super(id);
        addObserver(this);
    }

    public void addComponent(MachineComponent mc) {
        components.add(mc);
        mc.addObserver(this);

        this.setChanged();
        notifyObservers(mc.getId());
    }

    @Override
    public void update(Observable o, Object arg) {
        long obs_id = (long) arg;
        System.out.println("Component with id [" + obs_id + "] added to Composite with id [" + this.getId() + "]");
    }
}
