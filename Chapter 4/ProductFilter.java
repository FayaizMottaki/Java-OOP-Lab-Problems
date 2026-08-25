public class ProductFilter {

    // 1. Filter by category
    void filterProducts(String category) {
        System.out.println("Searching by category: " + category);
    }

    // 2. Filter by price range
    void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Searching by price: $" + minPrice + " - $" + maxPrice);
    }

    // 3. Filter by brand
    void filterProducts(String brand, boolean byBrand) {
        System.out.println("Searching by brand: " + brand);
    }

    // 4. Filter by category and price range
    void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Searching by category: " + category
                + ", price: $" + minPrice + " - $" + maxPrice);
    }

    // 5. Filter by category, price range, and brand
    void filterProducts(String category, double minPrice,
                        double maxPrice, String brand) {
        System.out.println("Searching by category: " + category
                + ", price: $" + minPrice + " - $" + maxPrice
                + ", brand: " + brand);
    }

    public static void main(String[] args) {

        ProductFilter p = new ProductFilter();

        p.filterProducts("electronics");

        p.filterProducts(100, 500);

        p.filterProducts("Apple", true);

        p.filterProducts("electronics", 100, 500);

        p.filterProducts("electronics", 100, 500, "Apple");
    }
}