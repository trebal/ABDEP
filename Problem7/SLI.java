package Problem7;

public class SLI {

    private ProductDescription desc;
    private int quantity;

    public SLI(ProductDescription desc, int quantity) {
        this.desc = desc;
        this.quantity = quantity;
    }

    public int subTotal() {
        return desc.getPrice() * quantity;
    }

    public ProductDescription getDesc() {
        return desc;
    }
}
