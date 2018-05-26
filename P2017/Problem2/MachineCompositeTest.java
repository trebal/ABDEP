package P2017.Problem2;

import org.junit.Before;
import org.junit.Test;

public class MachineCompositeTest {

    private MachineComposite testMachineComposite;

    @Before
    public void initTestMachineComposite(){
        testMachineComposite = new MachineComposite(1);
    }

    @Test
    public void testUpdate()
    {
        Machine machineComponent1 = new Machine(2);
        Machine machineComponent2 = new Machine(3);

        /*testMachineComposite.addComponent(machineComponent1);
        testMachineComposite.addComponent(machineComponent2);*/
    }
}
