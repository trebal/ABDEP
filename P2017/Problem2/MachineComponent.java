package P2017.Problem2;

import java.util.Observable;

public abstract class MachineComponent {

    protected long id;

    public MachineComponent(long id)
    {
        this.id = id;
    }

    public long getId() {
        return this.id;
    }
}
