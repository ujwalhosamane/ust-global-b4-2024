package service;

import model.Product;

public class CartServiceImpl implements CartService{
    private Cart cart;

    public CartServiceImpl() {
        this.cart = new Cart();
    }
    
    @Override
    public void addToCart(Product product) {
        Product[] currentProducts = cart.getProducts();
        
        Product[] newProducts = new Product[currentProducts.length + 1];
        
        for (int i = 0; i < currentProducts.length; i++) {
            newProducts[i] = currentProducts[i];
        }
        
        newProducts[currentProducts.length] = product;
        
        cart.setProducts(newProducts);
        
        cart.setTotalValue(cart.getTotalValue() + product.getPrice());
    }

    @Override
    public void displayCartDetails() {
        Product[] products = cart.getProducts();
        
        if (products.length == 0) {
            System.out.println("The cart is empty.");
        } else {
            
            System.out.println("Cart Details:");
            
            for (Product product : products) {
                System.out.println("Product ID: " + product.getProductId());
                System.out.println("Product Name: " + product.getProductName());
                System.out.println("Description: " + product.getDescription());
                System.out.println("Price: Rs. + product.getPrice());
                System.out.println("---------------------------");
            }
            
            System.out.println("Total Value: Rs." + cart.getTotalValue());
        }
    }
}
