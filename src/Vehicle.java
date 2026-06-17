//Siddhartha Kohar - 116234
import java.util.ArrayList;
class Vehicle {
    private String plateNumber;
    private int rentalDays;

    public Vehicle(String plateNumber, int rentalDays) {
        this.plateNumber = plateNumber;
        this.rentalDays = rentalDays;
    }

    public String getPlateNumber() { return plateNumber; }
    public int getRentalDays() { return rentalDays; }

    // Base calculation rate (overridden by specific child behaviors)
    public double calculateFee() {
        return rentalDays * 20.0; // Flat base fee per day
    }
}

// Subclasses overriding calculations within the same domain space
class Bike extends Vehicle {
    public Bike(String plateNumber, int rentalDays) {
        super(plateNumber, rentalDays);
    }

    @Override
    public double calculateFee() {
        // Bikes get a cheaper flat daily rate with no extra overhead
        return getRentalDays() * 15.0;
    }
}

class Bus extends Vehicle {
    private int passengerCapacity;

    public Bus(String plateNumber, int rentalDays, int passengerCapacity) {
        super(plateNumber, rentalDays);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateFee() {
        // Buses charge a higher base daily rate plus an added capacity premium tax
        double baseBusRate = getRentalDays() * 80.0;
        double capacitySurcharge = passengerCapacity * 2.50;
        return baseBusRate + capacitySurcharge;
    }
}