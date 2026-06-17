//Siddhartha Kohar - 116234
abstract class ElectronicDevice {
    private String modelName;

    public ElectronicDevice(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    // Abstract method: Every subclass *must* provide its own specific behavior here
    public abstract void powerOn();
}

// Concrete subclasses declared within the same file structure
class Printer extends ElectronicDevice {
    public Printer(String modelName) {
        super(modelName);
    }

    @Override
    public void powerOn() {
        System.out.println(getModelName() + " (Printer): Warming up ink drums and initializing rollers...");
    }
}

class Scanner extends ElectronicDevice {
    public Scanner(String modelName) {
        super(modelName);
    }

    @Override
    public void powerOn() {
        System.out.println(getModelName() + " (Scanner): Calibrating optical lenses and warming up LED lights...");
    }
}