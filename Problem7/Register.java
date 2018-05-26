package Problem7;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Register implements Observer {

    private Store store;
    private Sale currentSale;

    public Register(Store store) {
        this.store = store;
    }

    public void createNewSale() {
        currentSale = new Sale();
    }

    @Override
    public void update(Observable o, Object arg) {
        String name = ((ProductDescription)arg).getDescription();
        float unit_price = ((ProductDescription)arg).getPrice();
        float total = currentSale.getTotal();

        System.out.println("Added new product[" + name + "] with price [" + unit_price + "]");
        System.out.println("Current total: " + total);
    }
}
