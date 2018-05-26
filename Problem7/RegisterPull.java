package Problem7;

import java.util.Observable;
import java.util.Observer;

public class RegisterPull implements Observer {

    private Store store;
    private Sale currentSale;

    public RegisterPull(Store store) {
        this.store = store;
    }

    public void createNewSale() {
        currentSale = new SalePull();

        currentSale.addObserver(this);
    }

    public Sale getCurrentSale() {
        return currentSale;
    }

    @Override
    public void update(Observable o, Object arg) {
        SalePull sale = (SalePull)o;
        String name = sale.getSLI().getDesc().getDescription();
        float unit_price = sale.getSLI().getDesc().getPrice();
        float total = sale.getTotal();

        System.out.println("Added new product[" + name + "] with price [" + unit_price + "]");
        System.out.println("Current total: " + total);
    }
}
