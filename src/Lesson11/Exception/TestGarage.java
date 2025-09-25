package Lesson11.Exception;

import java.util.Scanner;

//Test Garage
public class TestGarage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Garage garage = new Garage();

        System.out.print("How many cars would you like to add to the garage?: ");
        int numberOfCars = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < numberOfCars; i++){
            System.out.print("Type the brand of your car " + "(" + (i + 1) + ") " + ": ");
            String brand = sc.nextLine();
            System.out.print("Type the model of your car" + "(" + (i + 1) + ") " +": ");
            String model = sc.nextLine();
            System.out.print("Type the kind of fuel your car " + "(" + (i + 1) + ") " + "uses: ");
            String fuelType = sc.nextLine();

            garage.addCar(new Car(brand, model, FuelType.valueOf(fuelType.toUpperCase())));
        }

        garage.listCars();

        System.out.print("Do you want to remove a car? (y/n): ");
        String answer = sc.nextLine();

        if(answer.equalsIgnoreCase("y")){
            System.out.print("At which index do you want a car removed?: ");
            int index = sc.nextInt();
            garage.removeCar(index);
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("Okay here is your cars listed again:");
            garage.listCars();
        } else {
            System.out.println("You did not enter y or n");
        }

    }
}
