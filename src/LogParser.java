//Siddhartha Kohar - 116234
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
class LogParser {

    public ArrayList<String> extractErrors(String filePath) {
        ArrayList<String> errorLogs = new ArrayList<>();
        File logFile = new File(filePath);

        // Using try-with-resources to ensure the Scanner stream closes automatically
        try (Scanner sc = new Scanner(logFile)) {

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                // Case-sensitive match tracking standard server error flags
                if (line.contains("ERROR")) {
                    errorLogs.add(line);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Execution Error: The file target '" + filePath + "' could not be found.");
        }

        return errorLogs;
    }
}