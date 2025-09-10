package TheDiceMan;

import java.util.Random;

public class Dice {
    //Attributes for the dice
    private final static int numberOfSides = 6;

    //Get number of sides
    public static int getNumberOfSides() {
        return numberOfSides;
    }

    //Roll the dice
    public static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(getNumberOfSides()) + 1;
    }
}
