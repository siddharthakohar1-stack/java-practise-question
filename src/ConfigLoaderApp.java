//Siddhartha Kohar - 116234
public class ConfigLoaderApp {
    public static void main(String[] args) {
        System.out.println("=== Initiating Core Engine Boot Sequence ===");

        ConfigurationManager configManager = new ConfigurationManager("config.txt");

        // Execute operational loading routine
        configManager.loadConfiguration();

        System.out.println("==========================================");
    }
}