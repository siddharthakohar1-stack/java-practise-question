//Siddhartha Kohar - 116234
class Contractor extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Contractor(String name, String employeeId, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked; // Dynamic performance hours calculation
    }
}