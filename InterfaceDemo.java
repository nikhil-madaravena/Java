// Interface
interface Vehicle {
    void start();
    void stop();
}

// Car implements Vehicle
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("The car starts with a key.");
    }

    @Override
    public void stop() {
        System.out.println("The car stops by applying brakes.");
    }
}

// Bicycle implements Vehicle
class Bicycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("The bicycle starts by pedaling.");
    }

    @Override
    public void stop() {
        System.out.println("The bicycle stops by applying hand brakes.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        // Start and stop each vehicle
        car.start();
        car.stop();

        bicycle.start();
        bicycle.stop();
    }
}
