package Problem7;

public class Main {

    public static void main(String[] args)
    {
        ProductDescription pdesc1 = new ProductDescription(
                "Product A", 100);
        ProductDescription pdesc2 = new ProductDescription(
                "Product B", 50);

        SLI sli1 = new SLI(pdesc1, 1);
        SLI sli2 = new SLI(pdesc2, 2);

        System.out.println("---------- PUSH version ----------");

        Store store_push = new Store();
        Register register_push = new Register(store_push);

        register_push.createNewSale();
        register_push.getCurrentSale().createSalesLineItem(pdesc1, 1);
        register_push.getCurrentSale().createSalesLineItem(pdesc2, 5);

        System.out.println("---------- PULL version ----------");

        Store store_pull = new Store();
        Register register_pull = new Register(store_pull);

        register_pull.createNewSale();
        register_pull.getCurrentSale().createSalesLineItem(pdesc1, 2);
        register_pull.getCurrentSale().createSalesLineItem(pdesc2, 1);
    }
}
