//Siddhartha Kohar - 116234
import java.util.ArrayList;
class RegistryAnalyzer {

    public void findAndPrintDuplicates(ArrayList<String> list) {
        // Keeps track of names we have already flagged so we don't print them multiple times
        ArrayList<String> alreadyFlagged = new ArrayList<>();
        boolean duplicateFound = false;

        // Outer loop selects a guest name
        for (int i = 0; i < list.size(); i++) {
            String currentGuest = list.get(i);

            // Inner loop scans the REMAINING items ahead of index 'i'
            for (int j = i + 1; j < list.size(); j++) {
                String comparisonGuest = list.get(j);

                // If a match is found and it's a real name (ignoring case)
                if (currentGuest.equalsIgnoreCase(comparisonGuest)) {

                    // Verify we haven't already reported this specific duplicate name
                    if (!alreadyFlagged.contains(currentGuest.toLowerCase())) {
                        System.out.println("Duplicate detected: \"" + currentGuest + "\" appears multiple times.");
                        alreadyFlagged.add(currentGuest.toLowerCase());
                        duplicateFound = true;
                    }
                    break; // Match found for index 'i', step to the next outer element
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("Clean Registry: No duplicate guests detected.");
        }
    }
}