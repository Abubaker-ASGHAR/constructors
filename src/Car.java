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

    // Copy Constructor (custom)
    public Car(Car car) {
        this.model = car.model;
        this.year = car.year;
    }

    // Method to display car info
    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}
