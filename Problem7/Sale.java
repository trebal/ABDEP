package Problem7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;

public abstract class Sale extends Observable {

    protected List<SLI> lines = new ArrayList<>();

    public abstract void createSalesLineItem(
            ProductDescription desc, int quantity);

    public List<SLI> getLines() {
        return Collections.unmodifiableList(lines);
    }

    public float getTotal() {
        List<SLI> currentSaleLines = getLines();
        float total = 0.0f;

        for (SLI sli : currentSaleLines) {
            total += sli.subTotal();
        }

        return total;
    }
}
