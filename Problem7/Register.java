package Problem7;

import java.util.Observable;
import java.util.Observer;

public class Register implements Observer {

    private Store store;
    private Sale currentSale;

    public Register(Store store) {
        this.store = store;
    }

    public void createNewSale() {
        currentSale = new SalePush();

        currentSale.addObserver(this);
    }

    public Sale getCurrentSale() {
        return currentSale;
    }

    @Override
    public void update(Observable o, Object arg) {
        String name = ((ProductDescription) arg).getDescription();
        float unit_price = ((ProductDescription) arg).getPrice();
        float total = currentSale.getTotal();

        System.out.println("Added new product[" + name + "] with price [" + unit_price + "]");
        System.out.println("Current total: " + total);
    }
}
