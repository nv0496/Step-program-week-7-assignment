// Base Class
abstract class Vehicle {
    String vehicleName;

    Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    // Method to be overridden
    abstract void dispatch();
}

// Bus Class
class Bus extends Vehicle {
    int capacity;
    String route;

    Bus(String vehicleName, int capacity, String route) {
        super(vehicleName);
        this.capacity = capacity;
        this.route = route;
    }

    @Override
    void dispatch() {
        System.out.println("\n--- Bus Dispatch ---");
        System.out.println("Bus: " + vehicleName);
        System.out.println("Route: " + route);
        System.out.println("Passenger Capacity: " + capacity);
        System.out.println("Following fixed route...");
    }
}

// Taxi Class
class Taxi extends Vehicle {
    double distance;
    double ratePerKm = 15.0;

    Taxi(String vehicleName, double distance) {
        super(vehicleName);
        this.distance = distance;
    }

    @Override
    void dispatch() {
        double fare = distance * ratePerKm;
        System.out.println("\n--- Taxi Dispatch ---");
        System.out.println("Taxi: " + vehicleName);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);
        System.out.println("Providing door-to-door service...");
    }
}

// Train Class
class Train extends Vehicle {
    int carCount;
    String schedule;

    Train(String vehicleName, int carCount, String schedule) {
        super(vehicleName);
        this.carCount = carCount;
        this.schedule = schedule;
    }

    @Override
    void dispatch() {
        System.out.println("\n--- Train Dispatch ---");
        System.out.println("Train: " + vehicleName);
        System.out.println("Cars: " + carCount);
        System.out.println("Schedule: " + schedule);
        System.out.println("Operating on fixed timetable...");
    }
}

// Bike Class
class Bike extends Vehicle {
    int duration; // rental duration in hours

    Bike(String vehicleName, int duration) {
        super(vehicleName);
        this.duration = duration;
    }

    @Override
    void dispatch() {
        System.out.println("\n--- Bike Dispatch ---");
        System.out.println("Bike: " + vehicleName);
        System.out.println("Rental Duration: " + duration + " hrs");
        System.out.println("Eco-friendly trip started...");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Vehicle v; // base class reference

        v = new Bus("CityBus-101", 50, "Route A");
        v.dispatch(); // calls Bus's version

        v = new Taxi("Taxi-202", 12.5);
        v.dispatch(); // calls Taxi's version

        v = new Train("Express-303", 12, "10:00 AM - Central Station");
        v.dispatch(); // calls Train's version

        v = new Bike("EcoBike-404", 2);
        v.dispatch(); // calls Bike's version
    }
}
