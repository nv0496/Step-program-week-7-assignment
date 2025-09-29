// Base Class
class SmartDevice {
    String deviceName;

    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }

    void showStatus() {
        System.out.println(deviceName + " is connected to the smart home system.");
    }
}

// Smart TV Class
class SmartTV extends SmartDevice {
    SmartTV(String deviceName) {
        super(deviceName);
    }

    void changeChannel(int channel) {
        System.out.println(deviceName + " switched to channel " + channel);
    }

    void adjustVolume(int volume) {
        System.out.println(deviceName + " volume set to " + volume);
    }

    void openApp(String app) {
        System.out.println(deviceName + " opened streaming app: " + app);
    }
}

// Smart Thermostat Class
class SmartThermostat extends SmartDevice {
    SmartThermostat(String deviceName) {
        super(deviceName);
    }

    void setTemperature(int temp) {
        System.out.println(deviceName + " temperature set to " + temp + "°C");
    }

    void setHumidity(int humidity) {
        System.out.println(deviceName + " humidity set to " + humidity + "%");
    }

    void enableEnergySaving() {
        System.out.println(deviceName + " energy-saving mode enabled.");
    }
}

// Smart Security System Class
class SmartSecurity extends SmartDevice {
    SmartSecurity(String deviceName) {
        super(deviceName);
    }

    void activateCamera() {
        System.out.println(deviceName + " camera is recording.");
    }

    void triggerAlarm() {
        System.out.println(deviceName + " alarm triggered!");
    }

    void manageAccess(String person) {
        System.out.println(deviceName + " access granted to " + person);
    }
}

// Smart Kitchen Appliance Class
class SmartKitchen extends SmartDevice {
    SmartKitchen(String deviceName) {
        super(deviceName);
    }

    void setCookingTime(int minutes) {
        System.out.println(deviceName + " cooking time set to " + minutes + " minutes.");
    }

    void setCookingTemperature(int temp) {
        System.out.println(deviceName + " cooking temperature set to " + temp + "°C.");
    }

    void loadRecipe(String recipe) {
        System.out.println(deviceName + " loaded recipe: " + recipe);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Mixed device collection
        SmartDevice[] devices = {
            new SmartTV("Living Room TV"),
            new SmartThermostat("Bedroom Thermostat"),
            new SmartSecurity("Home Security System"),
            new SmartKitchen("Smart Oven")
        };

        // Process devices safely
        for (SmartDevice device : devices) {
            System.out.println("\nChecking device: " + device.deviceName);
            device.showStatus();

            if (device instanceof SmartTV) {
                SmartTV tv = (SmartTV) device;
                tv.changeChannel(5);
                tv.adjustVolume(15);
                tv.openApp("Netflix");
            } else if (device instanceof SmartThermostat) {
                SmartThermostat thermostat = (SmartThermostat) device;
                thermostat.setTemperature(22);
                thermostat.setHumidity(50);
                thermostat.enableEnergySaving();
            } else if (device instanceof SmartSecurity) {
                SmartSecurity security = (SmartSecurity) device;
                security.activateCamera();
                security.triggerAlarm();
                security.manageAccess("John Doe");
            } else if (device instanceof SmartKitchen) {
                SmartKitchen kitchen = (SmartKitchen) device;
                kitchen.setCookingTime(30);
                kitchen.setCookingTemperature(180);
                kitchen.loadRecipe("Pizza");
            }
        }
    }
}
