//Siddhartha Kohar - 116234
public class InventoryApp {
    public static void main(String[] args) {

        // Initializing a standard array loaded with concrete structural instances
        Electronics[] inventory = {
                new Electronics("OLED Television", 1200.00),
                new Electronics("Wireless Headphones", 250.00),
                new Electronics("Mechanical Keyboard", 120.50)
        };

        System.out.println("--- Initiating Storewide 10% Clearance Event ---");

        // Iterating through the collection and applying the interface action
        for (Electronics item : inventory) {
            item.applyDiscount(10.0);
        }

        System.out.println("------------------------------------------------");
    }
}