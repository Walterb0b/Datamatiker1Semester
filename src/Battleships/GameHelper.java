package Battleships;

import java.util.Scanner;

public class GameHelper {
    private static Scanner scanner = new Scanner(System.in);
    public static int userInput() {

        System.out.print("Enter your shot: ");

        while(!scanner.hasNextInt()){
            System.out.println("Invalid input. Try again.");
            scanner.next();
        }

        return scanner.nextInt();
    }
    public static void close(){
        scanner.close();
    }
}
