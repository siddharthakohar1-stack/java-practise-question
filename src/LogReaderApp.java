//Siddhartha Kohar - 116234
import java.util.ArrayList;
public class LogReaderApp {
    public static void main(String[] args) {
        LogParser parser = new LogParser();

        System.out.println("Scanning 'server.log' for critical system exceptions...");
        ArrayList<String> isolatedErrors = parser.extractErrors("server.log");

        // Reporting results
        System.out.println("\n--- Scan Complete ---");
        System.out.println("Total Error Traces Found: " + isolatedErrors.size());
        System.out.println("---------------------");

        // Print out the extracted errors
        for (String errorEntry : isolatedErrors) {
            System.out.println(errorEntry);
        }
    }
}