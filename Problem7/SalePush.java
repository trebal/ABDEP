package Problem7;

public class SalePush extends Sale {

    @Override
    public void createSalesLineItem(
            ProductDescription desc, int quantity) {
        SLI sli = new SLI(desc, quantity);
        lines.add(sli);

        this.setChanged();
        this.notifyObservers(sli.getDesc());
    }
}
