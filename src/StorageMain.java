//Siddhartha Kohar - 116234
public class StorageMain {
    public static void main(String[] args) {
        // Create a ColdBox unit
        ColdBox vaccineStorage = new ColdBox("CB-902", 15.5, 4);

        // Access inherited methods from StorageUnit
        System.out.println("Unit ID: " + vaccineStorage.getId());
        System.out.println("Capacity: " + vaccineStorage.getCapacity() + " m³");

        // Trigger the interface method implementation
        vaccineStorage.adjustTemp(-18);
    }
}