//Siddhartha Kohar - 116234
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class SalesLogger {

    public void saveWeeklySales(double[] salesArray, String filename) {
        // Try-with-resources automatically closes streams when the block exits
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {

            for (double dailySale : salesArray) {
                bw.write(String.valueOf(dailySale));
                bw.newLine(); // Forces each double onto its own fresh line
            }
            System.out.println("Sales successfully logged to " + filename);

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}