package P2017.Problem2_v2;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class MachineComposite extends MachineComponent implements Observer {

    private Observable observable = new Observable();
    private ArrayList<MachineComponent> components = new ArrayList<>();

    public MachineComposite(long id) {
        super(id);
        addObserver(this);
    }

    private void addObserver(Observer o) {
        observable.addObserver(o);
    }

    public void addComponent(MachineComposite mc) {
        mc.addObserver(this);
        add(mc);
    }

    protected void add(MachineComponent mc) {
        // Adds the component to the list
        components.add(mc);
        // Adds the observer only if is of class MachineComposite
        if (mc instanceof MachineComposite) {
            ((MachineComposite) mc).addObserver(this);
        }
    }

    @Override
    public void addThis(MachineComposite mc)
    {
        mc.add(this);
        this.addObserver(mc);
    }

    @Override
    public void update(Observable o, Object arg) {
        long obs_id = (long) arg;
        System.out.println("Component with id [" + obs_id + "] added to Composite with id [" + this.getId() + "]");
    }
}
