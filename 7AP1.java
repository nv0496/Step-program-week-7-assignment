class HotelBooking {

    // 1. Standard Booking
    public void calculatePrice(String roomType, int nights) {
        int baseRate = getRoomRate(roomType);
        int total = baseRate * nights;
        System.out.println("\n--- Standard Booking ---");
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Total Price: ₹" + total);
    }

    // 2. Seasonal Booking
    public void calculatePrice(String roomType, int nights, double seasonalMultiplier) {
        int baseRate = getRoomRate(roomType);
        double total = baseRate * nights * seasonalMultiplier;
        System.out.println("\n--- Seasonal Booking ---");
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Seasonal Multiplier: " + seasonalMultiplier);
        System.out.println("Total Price: ₹" + total);
    }

    // 3. Corporate Booking
    public void calculatePrice(String roomType, int nights, double corporateDiscount, boolean mealPackage) {
        int baseRate = getRoomRate(roomType);
        double total = baseRate * nights;
        double discount = total * corporateDiscount;
        total -= discount;

        if (mealPackage) {
            total += 500 * nights; // ₹500 per night for meals
        }

        System.out.println("\n--- Corporate Booking ---");
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Corporate Discount: " + (corporateDiscount * 100) + "% (-₹" + discount + ")");
        System.out.println("Meal Package: " + (mealPackage ? "Yes (+₹500 per night)" : "No"));
        System.out.println("Total Price: ₹" + total);
    }

    // 4. Wedding Package Booking
    public void calculatePrice(String roomType, int nights, int guestCount, int decorationFee, int cateringCostPerGuest) {
        int baseRate = getRoomRate(roomType);
        int roomCost = baseRate * nights;
        int cateringCost = guestCount * cateringCostPerGuest;
        int total = roomCost + decorationFee + cateringCost;

        System.out.println("\n--- Wedding Package ---");
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Guests: " + guestCount);
        System.out.println("Decoration Fee: ₹" + decorationFee);
        System.out.println("Catering Cost: ₹" + cateringCost);
        System.out.println("Total Price: ₹" + total);
    }

    // Helper Method: Room Base Rate
    private int getRoomRate(String roomType) {
        switch (roomType.toLowerCase()) {
            case "standard": return 2000;
            case "deluxe": return 3500;
            case "suite": return 6000;
            default: return 1500; // default basic room
        }
    }
}

public class Main {
    public static void main(String[] args) {
        HotelBooking booking = new HotelBooking();

        booking.calculatePrice("Standard", 3);  // Standard Booking
        booking.calculatePrice("Deluxe", 5, 1.2);  // Seasonal Booking
        booking.calculatePrice("Suite", 2, 0.15, true);  // Corporate Booking
        booking.calculatePrice("Deluxe", 2, 100, 5000, 800);  // Wedding Package
    }
}
