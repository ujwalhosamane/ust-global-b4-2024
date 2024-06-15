package model;

public class Cart {

    private Product[] products;

    private float totalValue;

    public Cart() {
        this.products = new Product[0];
        this.totalValue = 0.0f;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public float getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(float totalValue) {
        this.totalValue = totalValue;
    }
}
