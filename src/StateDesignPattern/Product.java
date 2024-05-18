package StateDesignPattern;

public class Product {
    int productId;
    String name;
    Double price;

    public Product(int productId, String name, Double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }


}
