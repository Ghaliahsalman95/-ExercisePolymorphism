import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
boolean exit=true;
do {
    System.out.println("Vehicle Rental System: ");
    System.out.println("1.Rent a Car ");
    System.out.println("2.Rent a Bike ");
    System.out.println("3.Rent a Truck");
    System.out.println("4.View Rented Vehicles");
    System.out.println("5.Exit");
    System.out.println("Please Choose from above menu");
    switch (input.nextInt()){
        case 1:
            System.out.println("Please Enter Car Model");
            String model=input.next();
            model+=input.nextLine();
            System.out.println("Please Enter Rental Day:");
            int days=input.nextInt();
            Vehicle car=new Car(model,days);
            car.calculateRentalCost();
            car.displayDetails();
            rentedVehicles.add(car);
            break;
        case 2:
            System.out.println("Please Enter Bike Brand");
            String brand=input.nextLine();
            brand+=input.nextLine();
            System.out.println("Please Enter Rental hour:");
            int hour=input.nextInt();
            Vehicle bike=new Bike(brand,hour);
            bike.calculateRentalCost();
            bike.displayDetails();
            rentedVehicles.add(bike);
            break;
        case 3:
            System.out.println("Please Enter Truck type");
            String type=input.next();
            type+=input.nextLine();
            input.nextLine();
            System.out.println("Please Enter Rental Week:");
            int week=input.nextInt();
            Vehicle truck=new Truck(type,week);
            truck.calculateRentalCost();
            truck.displayDetails();
            rentedVehicles.add(truck);
            break;
        case 4:
            System.out.println("Info: ");
            for (Vehicle vehicle:rentedVehicles){
                vehicle.displayDetails();
                System.out.println("----------------");}
            break;
        case 5:
            System.out.println("Thank you for using the Vehicle Rental System!");
            exit=false;
        default:
            System.out.println("Default");
    }


}while (exit);



    }
}