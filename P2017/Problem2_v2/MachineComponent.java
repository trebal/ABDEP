package P2017.Problem2_v2;

public abstract class MachineComponent {

    protected long id;

    public MachineComponent(long id) {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }

    public abstract void addThis(MachineComposite mc);
}
