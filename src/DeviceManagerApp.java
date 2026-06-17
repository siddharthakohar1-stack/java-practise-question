//Siddhartha Kohar - 116234
public class DeviceManagerApp {
    public static void main(String[] args) {

        // Creating an array of the abstract parent type containing concrete child instances
        ElectronicDevice[] officeHardware = {
                new Printer("HP LaserJet 500"),
                new Scanner("Fujitsu ScanSnap")
        };

        System.out.println("--- Initiating Office Morning Boot-Up ---");

        // Polymorphic Loop
        for (ElectronicDevice device : officeHardware) {
            // Java looks at the *actual object type* at runtime to determine which version of powerOn() to execute
            device.powerOn();
        }
    }
}