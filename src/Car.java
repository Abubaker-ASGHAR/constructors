public class Car {
    private String model;
    private int year;

    // Default Constructor
    public Car() {
        this.model = "Unknown";
        this.year = 0;
    }

    // Parameterized Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car info
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}
