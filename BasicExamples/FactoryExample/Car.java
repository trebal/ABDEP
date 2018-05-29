package BasicExamples.FactoryExample;

public class Car extends Vehicle {

    private int occupants;

    public Car(long id, int o) {
        super(id);
        this.occupants = o;
    }
}
