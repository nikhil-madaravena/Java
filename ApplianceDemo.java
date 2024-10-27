abstract class Appliance {
    private String brand;

    // Constructor for initializing brand
    public Appliance(String brand) {
        this.brand = brand;
    }

    // Concrete method
    public void showBrand() {
        System.out.println("Brand: " + brand);
    }

    // Abstract method
    abstract void turnOn();
}

// Subclass for Washing Machine
class WashingMachine extends Appliance {
    public WashingMachine(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println("Washing machine starts washing clothes.");
    }
}

// Subclass for Refrigerator
class Refrigerator extends Appliance {
    public Refrigerator(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        System.out.println("Refrigerator starts cooling.");
    }
}

public class ApplianceDemo {
    public static void main(String[] args) {
        Appliance washingMachine = new WashingMachine("LG");
        Appliance refrigerator = new Refrigerator("Samsung");

        washingMachine.showBrand();
        washingMachine.turnOn();

        refrigerator.showBrand();
        refrigerator.turnOn();
    }
}
