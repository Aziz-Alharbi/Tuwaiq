public class Bike implements Vehicle{


    String brand;
    int hour;


    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    @Override
    public double calculateRentalCost() {
        return 10*hour;
    }

    @Override
    public void displayDetails() {

        System.out.println("Bike Brand: " + brand);
        System.out.println("Hourly Rental Rate: $10.0");

    }
}
