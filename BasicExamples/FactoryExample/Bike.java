package BasicExamples.FactoryExample;

public class Bike extends Vehicle {

    private int wheel_type;

    public Bike(long id, int wt) {
        super(id);
        this.wheel_type = wt;
    }
}
