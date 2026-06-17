//Siddhartha Kohar - 116234
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Class 1: The Core Configuration Utility Engine
class ConfigurationManager {
    private final String configPath;

    public ConfigurationManager(String configPath) {
        this.configPath = configPath;
    }

    // Attempt to read the initialization parameters
    public void loadConfiguration() {
        File file = new File(configPath);

        try (Scanner scanner = new Scanner(file)) {
            System.out.println("Config file found! Loading settings...");
            while (scanner.hasNextLine()) {
                System.out.println(" >> " + scanner.nextLine());
            }
            System.out.println("Application initialized successfully.");

        } catch (FileNotFoundException e) {
            // Intercepting missing file error and executing recovery routine
            System.out.println("Warning: '" + configPath + "' not found. Running self-healing setup...");
            generateDefaultConfig();
        }
    }

    // Fallback logic to create a default file state if missing
    private void generateDefaultConfig() {
        try (FileWriter writer = new FileWriter(configPath)) {
            writer.write("## App Configuration Defaults ##\n");
            writer.write("theme=dark\n");
            writer.write("max_connections=10\n");
            writer.write("debug_mode=false\n");

            System.out.println("Success: Created standard 'config.txt' with default safe values.");
            System.out.println("Please restart the application to apply changes.");

        } catch (IOException e) {
            System.err.println("Critical Error: Failed to write system defaults to disk: " + e.getMessage());
        }
    }
}