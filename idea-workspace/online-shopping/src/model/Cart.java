package model;

public class Cart {

    private Product[] products;

    private float totalValue;

    public Cart(Product[] products, float totalValue) {
        this.products = products;
        this.totalValue = totalValue;
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
