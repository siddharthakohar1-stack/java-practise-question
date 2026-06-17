//Siddhartha Kohar - 116234
abstract class StorageUnit {
    private String id;
    private double capacity; // in cubic meters

    public StorageUnit(String id, double capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    // Getters for encapsulation
    public String getId() { return id; }
    public double getCapacity() { return capacity; }
}

// Interface defining the capability to manage temperature
interface Refrigerated {
    void adjustTemp(int targetTemperature);
}

// Subclass that inherits base properties and implements specialized behavior
class ColdBox extends StorageUnit implements Refrigerated {
    private int currentTemperature;

    public ColdBox(String id, double capacity, int initialTemp) {
        super(id, capacity);
        this.currentTemperature = initialTemp;
    }

    @Override
    public void adjustTemp(int targetTemperature) {
        this.currentTemperature = targetTemperature;
        System.out.println("ColdBox [" + getId() + "] temperature adjusted to: " + this.currentTemperature + "°C");
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
}
