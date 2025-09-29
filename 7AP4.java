// Base Class
class MedicalStaff {
    String name;
    int staffId;

    MedicalStaff(String name, int staffId) {
        this.name = name;
        this.staffId = staffId;
    }

    // Common operations
    void scheduleShift(String shift) {
        System.out.println(name + " (ID: " + staffId + ") scheduled for " + shift + " shift.");
    }

    void accessIDCard() {
        System.out.println(name + " (ID: " + staffId + ") granted hospital access.");
    }

    void processPayroll() {
        System.out.println(name + " (ID: " + staffId + ") payroll processed.");
    }
}

// Doctor Class
class Doctor extends MedicalStaff {
    Doctor(String name, int staffId) {
        super(name, staffId);
    }

    void diagnosePatient() {
        System.out.println(name + " is diagnosing a patient...");
    }

    void prescribeMedicine() {
        System.out.println(name + " is prescribing medicine...");
    }

    void performSurgery() {
        System.out.println(name + " is performing surgery...");
    }
}

// Nurse Class
class Nurse extends MedicalStaff {
    Nurse(String name, int staffId) {
        super(name, staffId);
    }

    void administerMedicine() {
        System.out.println(name + " is administering medicine...");
    }

    void monitorPatient() {
        System.out.println(name + " is monitoring patient vitals...");
    }

    void assistProcedure() {
        System.out.println(name + " is assisting in a medical procedure...");
    }
}

// Technician Class
class Technician extends MedicalStaff {
    Technician(String name, int staffId) {
        super(name, staffId);
    }

    void operateEquipment() {
        System.out.println(name + " is operating medical equipment...");
    }

    void runTests() {
        System.out.println(name + " is running lab tests...");
    }

    void maintainInstruments() {
        System.out.println(name + " is maintaining hospital instruments...");
    }
}

// Administrator Class
class Administrator extends MedicalStaff {
    Administrator(String name, int staffId) {
        super(name, staffId);
    }

    void scheduleAppointments() {
        System.out.println(name + " is scheduling patient appointments...");
    }

    void manageRecords() {
        System.out.println(name + " is managing hospital records...");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Upcasting examples
        MedicalStaff staff1 = new Doctor("Dr. Alice", 101);
        MedicalStaff staff2 = new Nurse("Nurse Bob", 102);
        MedicalStaff staff3 = new Technician("Tech Charlie", 103);
        MedicalStaff staff4 = new Administrator("Admin David", 104);

        // All can do common tasks
        staff1.scheduleShift("Morning");
        staff2.accessIDCard();
        staff3.processPayroll();
        staff4.scheduleShift("Night");

        System.out.println("\n--- Specialized Roles ---");

        // Downcasting to access specialized methods
        ((Doctor) staff1).performSurgery();
        ((Nurse) staff2).monitorPatient();
        ((Technician) staff3).runTests();
        ((Administrator) staff4).manageRecords();
    }
}
