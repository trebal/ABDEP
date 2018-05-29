package Test;

public class CarFactory {

    public Vehicle vehicleFactory(int type) {
        if (type == 0) {
            return new Car(1, 4);
        } else {
            return new Bike(2, 3);
        }
    }
}
