public class Truck implements Vehicle{



    String type;
    int week;



    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }


    @Override
    public double calculateRentalCost() {
        return 500*week;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: " + type);
        System.out.println("Weekly Rental Rate: $500.0");
    }
}
