package Problem7;
import java.util.*;

public class Sale extends Observable {
    private List<SLI> lines = new ArrayList<>();

    public void createSalesLineItem(ProductDescription desc, int quantity) {
        SLI sli = new SLI(desc, quantity);
        lines.add(sli);
    }

    public void Sale()
    {
        lines = new ArrayList<>();
    }

    public void createSaleLine(ProductDescription pd, int quantity)
    {
        SLI sli = new SLI(pd, quantity);
        lines.add(sli);

        setChanged();
        notifyObservers(); // Pull action
        // notifyObservers(sli); // Push action
    }

    public SLI getLast()
    {
        return lines.get(lines.size() - 1);
    }
}