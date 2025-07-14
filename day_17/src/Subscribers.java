public class Subscribers extends Passenger {


    public Subscribers(String name, int id) {
        super(name, id);
    }

    @Override
    void reserveCar(Car car) throws Exception {


        if (car.maxCapacity == 0) {
            System.out.println("Car is full! Cannot reserve.");

            return;
        }

        reservedCar = car;
        tripCost = car.route.tripPrice * 0.5; // 50% discount
        car.maxCapacity--;

    }



        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Trip Cost: " + tripCost);
        }



}
