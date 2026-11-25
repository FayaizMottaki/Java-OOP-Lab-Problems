import java.util.ArrayList;
import java.util.List;

public class ShoppingSystem {
    public static void main(String[] args) {
        Customer customer = new Customer(10, "Asha", "01800000000");
        Product book = new Product(1, "Java guide", 650.0);
        Product mouse = new Product(2, "Wireless mouse", 1200.0);
        ShoppingCart cart = customer.createCart(1001);
        cart.add(book);
        cart.add(mouse);
        Payment payment = new Payment(501, cart.calculatePrice());
        payment.makePayment();
        System.out.printf("Cart total: %.2f; payment status: %s%n",
                cart.calculatePrice(), payment.getStatus());
    }
}

final class Product {
    private final int id;
    private String productName;
    private double pricePerUnit;
    Product(int id, String productName, double pricePerUnit) {
        this.id = id; this.productName = productName; setPricePerUnit(pricePerUnit);
    }
    double getPricePerUnit() { return pricePerUnit; }
    void setPricePerUnit(double value) {
        if (value < 0) throw new IllegalArgumentException("Price cannot be negative");
        pricePerUnit = value;
    }
}

final class ShoppingCart {
    private final int cartId;
    private final int userId;
    private final List<Product> productList = new ArrayList<>();
    ShoppingCart(int cartId, int userId) { this.cartId = cartId; this.userId = userId; }
    void add(Product product) { productList.add(product); }
    double calculatePrice() {
        double total = 0;
        for (Product product : productList) total += product.getPricePerUnit();
        return total;
    }
}

final class Payment {
    private final int paymentId;
    private final double totalAmount;
    private String status = "PENDING";
    Payment(int paymentId, double totalAmount) { this.paymentId = paymentId; this.totalAmount = totalAmount; }
    double calculatePrice() { return totalAmount; }
    void makePayment() { status = "PAID"; }
    String getStatus() { return status; }
}

final class Customer {
    private final int userId;
    private final String name;
    private final String phoneNumber;
    private final List<ShoppingCart> carts = new ArrayList<>();
    Customer(int userId, String name, String phoneNumber) {
        this.userId = userId; this.name = name; this.phoneNumber = phoneNumber;
    }
    ShoppingCart createCart(int cartId) {
        ShoppingCart cart = new ShoppingCart(cartId, userId);
        carts.add(cart);
        return cart;
    }
}
