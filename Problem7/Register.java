package Problem7;

import java.util.Observable;
import java.util.Observer;

public class Register {
    private Store store;
    private Sale currentSale;

    public Register(Store store) {
        this.store = store;
    }

    public void createNewSale() {
        currentSale = new Sale();
    }
}