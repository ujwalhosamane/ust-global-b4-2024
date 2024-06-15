package model;

public class Product {

    private int productId;
    private String productName;
    private String description;
    private float price;

    public Product(int productId, String productName, String description, float price) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.price = price;
    }

    public int getProductId() {
        return this.productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getDescription() {
        return this.description;
    }

    public float getPrice() {
        return this.price;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
