public class Normal extends Passenger{

    boolean hasCoupon;


    public Normal(String name, int id, boolean hasCoupon) {
        super(name, id);
        this.hasCoupon = hasCoupon;
    }

    @Override
    void reserveCar(Car car) throws Exception {
        if(car.maxCapacity == 0){
            throw new Exception("Car is full !");
        }
        reservedCar = car;
        if (hasCoupon) {
            tripCost = car.route.tripPrice * 0.9; // 10% discount
        } else {
            tripCost = car.route.tripPrice; // no discount
        }
        car.maxCapacity--; // this was missing


    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Trip Cost: " + tripCost);
    }


}
