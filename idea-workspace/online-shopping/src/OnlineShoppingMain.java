public class OnlineShoppingMain {

    public static void main(String[] args) {

        // Create some products
        Product product1 = new Product(1, "Laptop", "High performance", 1200.99);
        Product product2 = new Product(2, "Smartphone", "Latest model", 799.49);
        Product product3 = new Product(3, "Headphone", "Noise cancelling", 199.99);
        
        // Add Product to cart
        CartService cartService = new CartServiceImpl();
        cartService.addToCart(product1);
        cartService.addToCart(product2);
        cartService.addToCart(product3);
        
        // Display the cart details
        cartService.displayCartDetails();
    }

}
