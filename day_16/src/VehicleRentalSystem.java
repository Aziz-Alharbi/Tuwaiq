import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleRentalSystem {



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> rentedVehicles = new ArrayList<>();

        while (true) {
            System.out.println("\nVehicle Rental System");
            System.out.println("1. Rent a Car");
            System.out.println("2. Rent a Bike");
            System.out.println("3. Rent a Truck");
            System.out.println("4. View Rented Vehicles");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Car Model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Enter Rental Days: ");
                    int days = scanner.nextInt();
                    Vehicle car = new Car(carModel, days);
                    rentedVehicles.add(car);
                    car.displayDetails();
                    System.out.println("Rental Cost: $" + car.calculateRentalCost());
                    break;

                case 2:
                    System.out.print("Enter Bike Brand: ");
                    String bikeBrand = scanner.nextLine();
                    System.out.print("Enter Rental Hours: ");
                    int hours = scanner.nextInt();
                    Vehicle bike = new Bike(bikeBrand, hours);
                    rentedVehicles.add(bike);
                    bike.displayDetails();
                    System.out.println("Rental Cost: $" + bike.calculateRentalCost());
                    break;

                case 3:
                    System.out.print("Enter Truck Type: ");
                    String truckType = scanner.nextLine();
                    System.out.print("Enter Rental Weeks: ");
                    int weeks = scanner.nextInt();
                    Vehicle truck = new Truck(truckType, weeks);
                    rentedVehicles.add(truck);
                    truck.displayDetails();
                    System.out.println("Rental Cost: $" + truck.calculateRentalCost());
                    break;

                case 4:
                    System.out.println("Rented Vehicles:");
                    for (Vehicle v : rentedVehicles) {
                        v.displayDetails();
                        System.out.println("Rental Cost: $" + v.calculateRentalCost());
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Vehicle Rental System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }







}
