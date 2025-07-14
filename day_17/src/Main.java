import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");





        //Create 2 routes and assign each of them to a different Car object. Note that one
        //of those cars should have a maximum capacity equal to zero .


        //• Create an array of Passengers containing 1 Subscriber and 1 non-Subscriber.
        //• Assign a different car object to each passenger and then display their
        //information.





        Route route1 = new Route("h", "h", 1);
        Route route2 = new Route("h", "h", 1);

        Car C1 = new Car("111", route1, 0);
        Car C2 = new Car("222", route2, 10);



        Passenger [] passengers = new Passenger[2];

        passengers[0] = new Subscribers("Aziz", 01);
        passengers[1] = new Normal("Mohammed", 02, true);


        passengers[0].reserveCar(C1);
        passengers[1].reserveCar(C2);

        for (Passenger p : passengers) {
            p.displayInfo();
        }




    }
}