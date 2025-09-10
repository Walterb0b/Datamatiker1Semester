package Battleships;

import java.util.Scanner;

public class GameHelper {
    public static int userInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your shot");

        int input = scanner.nextInt();

        return input;
    }
}
