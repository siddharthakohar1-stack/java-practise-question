//Siddhartha Kohar - 116234
import java.util.ArrayList;
public class GuestListApp {
    public static void main(String[] args) {
        ArrayList<String> guestList = new ArrayList<>();

        // Populate the list with sample test data (including duplicates)
        guestList.add("Alice");
        guestList.add("Bob");
        guestList.add("Charlie");
        guestList.add("Alice");  // Duplicate
        guestList.add("David");
        guestList.add("Bob");    // Duplicate
        guestList.add("Alice");  // Triplicate (handled gracefully)

        System.out.println("Analyzing guest list registry...");

        RegistryAnalyzer analyzer = new RegistryAnalyzer();
        analyzer.findAndPrintDuplicates(guestList);
    }
}