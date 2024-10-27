// Superclass
class Bank {
    // Method to be overridden
    public double getInterestRate() {
        return 0.0; // Default interest rate
    }
}

// Subclass representing Chase Bank
class ChaseBank extends Bank {
    @Override
    public double getInterestRate() {
        return 3.5; // Chase Bank's interest rate
    }
}

// Subclass representing Wells Fargo
class WellsFargo extends Bank {
    @Override
    public double getInterestRate() {
        return 4.0; // Wells Fargo's interest rate
    }
}

// Subclass representing Citi Bank
class CitiBank extends Bank {
    @Override
    public double getInterestRate() {
        return 3.8; // Citi Bank's interest rate
    }
}

// Main class to test method overriding
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Bank chase = new ChaseBank();       // Bank reference to ChaseBank object
        Bank wellsFargo = new WellsFargo(); // Bank reference to WellsFargo object
        Bank citiBank = new CitiBank();     // Bank reference to CitiBank object

        // Calling getInterestRate() on each bank
        System.out.println("Chase Bank Interest Rate: " + chase.getInterestRate() + "%");
        System.out.println("Wells Fargo Interest Rate: " + wellsFargo.getInterestRate() + "%");
        System.out.println("Citi Bank Interest Rate: " + citiBank.getInterestRate() + "%");
    }
}
