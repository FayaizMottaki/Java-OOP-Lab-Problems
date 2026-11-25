public class RestaurantOrdering {
    public static void main(String[] args) {
        Restaurant[] restaurants = {
            new Restaurant("General Restaurant", 0.10, 40),
            new FastFoodRestaurant("Quick Bites", 0.15),
            new FineDiningRestaurant("Cedar House")
        };
        for (Restaurant restaurant : restaurants) {
            System.out.printf("%s: total %.2f, delivery %d minutes%n",
                    restaurant.getName(), restaurant.calculateTotalBill(1000.0),
                    restaurant.estimateDeliveryTime());
        }
    }
}

class Restaurant {
    private final String name;
    private final double taxRate;
    Restaurant(String name, double taxRate, int ignoredDeliveryTime) {
        this.name = name; this.taxRate = taxRate;
    }
    String getName() { return name; }
    double calculateTotalBill(double foodPrice) { return foodPrice * (1 + taxRate); }
    int estimateDeliveryTime() { return 40; }
}

final class FastFoodRestaurant extends Restaurant {
    FastFoodRestaurant(String name, double taxRate) { super(name, taxRate, 20); }
    @Override int estimateDeliveryTime() { return 20; }
}

final class FineDiningRestaurant extends Restaurant {
    FineDiningRestaurant(String name) { super(name, 0.10, 60); }
    @Override int estimateDeliveryTime() { return 60; }
}
