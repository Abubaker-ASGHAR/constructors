//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(); // Uses the default constructor
        Car car2 = new Car("Toyota", 2022); // Uses the parameterized constructor
        car1.displayInfo();
        car2.displayInfo();

    }
}