package Problem7;

public class ProductDescription {

    private String description;
    private int price;

    public ProductDescription() {
        this.description = "Default";
        this.price = 0;
    }

    public ProductDescription(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
