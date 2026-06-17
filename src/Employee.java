//Siddhartha Kohar - 116234
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// Class 1: Parent class providing a common structural contract for all staff types
abstract class Employee {
    private String name;
    private String employeeId;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() { return name; }
    public String getEmployeeId() { return employeeId; }

    // Polymorphic Method Contract: Must be uniquely calculated by child classes
    public abstract double calculatePay();
}

// Subclass 1: Full-Time staff utilizing fixed salary structures
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, String employeeId, double monthlySalary) {
        super(name, employeeId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return monthlySalary; // Fixed monthly baseline rate
    }
}