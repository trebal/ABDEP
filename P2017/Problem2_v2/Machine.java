package P2017.Problem2_v2;

public class Machine extends MachineComponent {

    public Machine(long id) {
        super(id);
    }

    @Override
    public void addThis(MachineComposite mc) {
        mc.add(this);
    }
}
