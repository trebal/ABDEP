package BasicExamples.FactoryExample;

import java.rmi.NoSuchObjectException;

public class VehicleFactory {

    /**
     * The vehicleFactory method takes a parameter which determines which vehicle
     * should be built. Note that in this example the parameter is the number of
     * occupants for a travel, and that way suggests a Car or a Bike.
     *
     * @param occupants The occupants that determines which vehicle to return.
     * @return A Vehicle, which could be either a Car or a Bike.
     */
    public Vehicle vehicleFactory(int occupants) throws NoSuchObjectException {
        if (occupants <= 2) {
            return new Bike(2, 3);
        } else if (occupants <= 5) {
            return new Car(1, 4);
        } else {
            throw new NoSuchObjectException("Take a bus or something dude.");
        }
    }
}
