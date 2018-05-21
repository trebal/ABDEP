package P2017.Problem3;

import P2017.Problem2.MachineComponent;

import java.util.ArrayList;

/**
 * In order to satisfy the requirements, this class has to be a Singleton.
 * This version uses the model <b>Lazy initialization</b> which consists in creating a constant which represents the
 * object, and the constructor with private visibility to avoid more instances to be created.
 * The object is obtained by the method getRegister, which creates the <b>Register</b> if does not exist yet, and returns it.
 *
 * @author Ramon de Llano Chamorro
 * @version 1.0 Lazy initialization
 */
public class RegisterLazy extends MachineComponent {

    private static RegisterLazy REGISTER;

    private ArrayList<MachineComponent> components = new ArrayList<>();

    private RegisterLazy(long id) {
        super(id);
    }

    public RegisterLazy getRegister() {
        if (REGISTER == null) {
            REGISTER = new RegisterLazy(0);
        }
        return REGISTER;
    }

    public void addComponent(String name, MachineComponent mc) {
        //TODO: should store the component with a relation of the name.
        components.add(mc);
    }

    public MachineComponent getComponent(String name) {
        //TODO: should return the register of the component by name.
        return null;
    }
}
