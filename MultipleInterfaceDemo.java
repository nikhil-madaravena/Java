interface SmartAppliance {
    void turnOn();
    void turnOff();
}

interface InternetEnabled {
    void connectToWiFi(String network);
}

// SmartDevice implements multiple interfaces
class SmartDevice implements SmartAppliance, InternetEnabled {
    @Override
    public void turnOn() {
        System.out.println("Smart device is powered on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart device is powered off.");
    }

    @Override
    public void connectToWiFi(String network) {
        System.out.println("Connecting to WiFi network: " + network);
    }
}

public class MultipleInterfaceDemo {
    public static void main(String[] args) {
        SmartDevice smartDevice = new SmartDevice();

        // Using methods from both interfaces
        smartDevice.turnOn();
        smartDevice.connectToWiFi("Home_WiFi");
        smartDevice.turnOff();
    }
}
