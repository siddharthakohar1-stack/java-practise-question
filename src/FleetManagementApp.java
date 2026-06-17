//Siddhartha Kohar - 116234
import java.util.ArrayList;
public class FleetManagementApp {
    public static void main(String[] args) {
        // Instantiating a generic parental typed ArrayList
        ArrayList<Vehicle> fleet = new ArrayList<>();

        // Polpulating list with individual specialized subclasses
        fleet.add(new Bike("BIKE-004", 3));
        fleet.add(new Bus("BUS-99X", 2, 40));
        fleet.add(new Vehicle("SEDAN-11", 5)); // Generic vehicle fallback test

        System.out.println("=== Generating Active Fleet Rental Invoices ===");

        // Iterating through the collections transparently
        for (Vehicle v : fleet) {
            System.out.println("Vehicle [" + v.getPlateNumber() + "] | Class Type: "
                    + v.getClass().getSimpleName()
                    + " | Total Rental Fee: $" + String.format("%.2f", v.calculateFee()));
        }
        System.out.println("===============================================");
    }
}