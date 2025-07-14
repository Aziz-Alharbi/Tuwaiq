public abstract class Passenger {


    String name;
    int id;
    Car reservedCar;
    double tripCost;



//    and a function that should be overridden to display
//    their information along with the car code and route price .
//    to reserve it to the passenger
//    and compute the trip cost

    public Passenger(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void reserveCar(Car car) throws Exception;




    void displayInfo() {
        System.out.println("Name: " + name);
        if (reservedCar != null) {
            System.out.println("Car Code: " + reservedCar.code);
            System.out.println("Trip Price: " + reservedCar.route.tripPrice);
        } else {
            System.out.println("No car reserved.");
        }
    }

}
