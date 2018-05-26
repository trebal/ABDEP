package Problem7;

public class SalePull extends Sale {

    private SLI sli;
    @Override
    public void createSalesLineItem(
            ProductDescription desc, int quantity) {
        SLI new_sli = new SLI(desc, quantity);
        lines.add(new_sli);

        sli = new_sli;
        this.setChanged();
        this.notifyObservers();
    }

    public SLI getSLI() {
        return sli;
    }
}
