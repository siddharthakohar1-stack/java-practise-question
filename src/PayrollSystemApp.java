//Siddhartha Kohar - 116234
import java.util.ArrayList;
import java.io.*;
public class PayrollSystemApp {
    public static void main(String[] args) {

        // 1. Maintain polymorphically diverse records within a unified generic ArrayList
        ArrayList<Employee> staffDirectory = new ArrayList<>();

        staffDirectory.add(new FullTimeEmployee("Alice Vance", "FT-101", 5200.00));
        staffDirectory.add(new Contractor("Bob Miller", "CO-504", 45.00, 160));
        staffDirectory.add(new FullTimeEmployee("Charlie Cox", "FT-102", 6100.00));
        staffDirectory.add(new Contractor("David Cross", "CO-902", 60.00, 85));

        String reportFilename = "payroll_report.txt";
        System.out.println("Processing payroll cycles for " + staffDirectory.size() + " active personnel...");

        // 2. Open up buffered standard file writer loops using try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(reportFilename))) {

            writer.write("==================================================\n");
            writer.write("             OFFICIAL PAYROLL REPORT              \n");
            writer.write("==================================================\n");
            writer.write(String.format("%-10s | %-15s | %-12s\n", "EMP ID", "NAME", "NET PAY"));
            writer.write("--------------------------------------------------\n");

            double runningTotalCompanyPayout = 0.0;

            // 3. Process active polymorphic iterations
            for (Employee emp : staffDirectory) {
                double computedPay = emp.calculatePay();
                runningTotalCompanyPayout += computedPay;

                // Safely format line contents into fixed structural widths
                String dataLine = String.format("%-10s | %-15s | $%10.2f",
                        emp.getEmployeeId(),
                        emp.getName(),
                        computedPay);

                writer.write(dataLine);
                writer.newLine(); // Shift cursor downwards natively
            }

            writer.write("--------------------------------------------------\n");
            writer.write(String.format("TOTAL DISBURSED COMPANY FUNDS: $%14.2f\n", runningTotalCompanyPayout));
            writer.write("==================================================\n");

            System.out.println("Success: Transaction payroll ledger cleanly compiled into '" + reportFilename + "'.");

        } catch (IOException e) {
            System.err.println("Critical System Fault: Failed to export logs to disk target. Details: " + e.getMessage());
        }
    }
}