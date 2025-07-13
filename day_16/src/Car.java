public class Car implements Vehicle {

    String model;
    int days;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }


    @Override
    public double calculateRentalCost() {
        return 50.0 * days;
    }

    @Override
    public void displayDetails() {

        System.out.println("Car Model: " + model);
        System.out.println("Daily Rental Rate: $50.0");
    }
}