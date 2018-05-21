package P2017.Problem3;

import P2017.Problem2.MachineComponent;

import java.util.ArrayList;

/**
 * In order to satisfy the requirements, this class has to be a Singleton.
 * This version uses the model <b>Eager initialization</b> which consists in creating a constant which represents the
 * object, and the constructor with private visibility to avoid more instances to be created.
 * At the beginning of the class, the constant <b>REGISTER</b> gets automatically the value from the constructor.
 *
 * @author Ramon de Llano Chamorro
 * @version 1.0 Eager initialization
 */
public class RegisterEager extends MachineComponent {

    public static final RegisterEager REGISTER = new RegisterEager(0);

    private ArrayList<MachineComponent> components = new ArrayList<>();

    private RegisterEager(long id) {
        super(id);
    }

    public void addComponent(String name, MachineComponent mc)
    {
        //TODO: should store the component with a relation of the name.
        components.add(mc);
    }

    public MachineComponent getComponent(String name)
    {
        //TODO: should return the register of the component by name.
        return null;
    }
}
